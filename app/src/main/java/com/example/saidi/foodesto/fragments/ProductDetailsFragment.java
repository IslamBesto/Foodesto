package com.example.saidi.foodesto.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.saidi.foodesto.BaseFragment;
import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.database.models.DatabaseFacade;
import com.example.saidi.foodesto.database.models.models.DBNutriment;
import com.example.saidi.foodesto.database.models.models.DBProduct;
import com.example.saidi.foodesto.interfaces.IProduct;
import com.example.saidi.foodesto.models.NutrimentQuality;
import com.example.saidi.foodesto.models.NutrimentType;
import com.example.saidi.foodesto.models.Nutriments;
import com.example.saidi.foodesto.models.Product;
import com.example.saidi.foodesto.models.SeverityType;
import com.example.saidi.foodesto.utils.NutrimentsUtils;
import com.example.saidi.foodesto.utils.StringUtils;
import com.example.saidi.foodesto.views.ProductPropertieView;
import com.example.saidi.foodesto.widget.FoodestoAppWidgetService;

import java.util.ArrayList;

import butterknife.BindView;

public class ProductDetailsFragment extends BaseFragment {

    public static final String EXTRA_PODUCT = "bar_code_number";
    private static boolean isFromDB = false;

    @BindView(R.id.product_image_view)
    protected ImageView mProductImage;
    @BindView(R.id.product_title)
    protected TextView mProductTitle;
    @BindView(R.id.product_subtitle)
    protected TextView mProductSubtitle;
    @BindView(R.id.product_properties_container)
    protected LinearLayout mProductPropertiesContainer;
    @BindView(R.id.product_additives_container)
    protected LinearLayout mProductAdditivesContainer;
    @BindView(R.id.grades)
    protected TextView mGrades;
    @BindView(R.id.no_product_error)
    protected TextView mNoProductError;
    @BindView(R.id.product_container)
    protected NestedScrollView mProductcontainer;
    @BindView(R.id.add_button)
    protected Button mAddButton;
    @BindView(R.id.product_properties_card)
    protected CardView mProductPropertiesCard;
    private IProduct mIProduct;
    private Product mProduct;
    private DBProduct mDbProduct;

    private Context mContext;
    private String nutritionDataPer;

    public ProductDetailsFragment() {
    }

    public static BaseFragment newInstance(@Nullable final IProduct product) {
        ProductDetailsFragment productDetailsFragment = new ProductDetailsFragment();
        if (product instanceof DBProduct) {
            isFromDB = true;
        } else {
            isFromDB = false;
        }
        final Bundle bundle = new Bundle();
        bundle.putSerializable(EXTRA_PODUCT, product);
        productDetailsFragment.setArguments(bundle);
        return productDetailsFragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_product_detail;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
        mContext = getContext();
        Bundle bundle = getArguments();
        if (bundle != null) {
            mIProduct = (IProduct) bundle.getSerializable(EXTRA_PODUCT);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getBaseActivity().getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getBaseActivity().getSupportActionBar().setTitle(R.string.product_details_title);
        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addProductToDb();
            }
        });
        if (isFromDB) {
            mAddButton.setVisibility(View.GONE);
            mDbProduct = (DBProduct) mIProduct;
            if (mDbProduct != null) {
                mProductTitle.setText(mDbProduct.getProductName());
                mProductSubtitle.setText(mDbProduct.getBrands());
                String nutritionGrades = mDbProduct.getNutritionGrades();
                if (!StringUtils.isNullOrEmpty(nutritionGrades)) {
                    mGrades.setText(nutritionGrades);
                    int gradeBackGround = NutrimentsUtils.getGradeBackGround(nutritionGrades);
                    mGrades.setBackground(ContextCompat.getDrawable(view.getContext(), gradeBackGround));
                } else {
                    mGrades.setVisibility(View.GONE);
                }
                Glide.with(mProductImage.getContext())
                        .load(mDbProduct.getImageThumbUrl())
                        .apply(new RequestOptions().placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background))
                        .into(mProductImage);
                DatabaseFacade.INSTANCE.getNutrimentsById(mDbProduct.getNutrimentID(), new DatabaseFacade.DatabaseCallback<DBNutriment>() {
                    @Override
                    public void databaseCallback(@Nullable DBNutriment nutriment) {
                        if (nutriment != null) {
                            String salt = nutriment.getSalt();
                            nutritionDataPer = mDbProduct.getNutritionDataPer();
                            for (String s : mDbProduct.getKeywords()) {
                                if (s.toLowerCase().equals("bio") || s.toLowerCase().equals("biologique") || s.toLowerCase().equals("biologic")) {
                                    ProductPropertieView productPropertieView = new ProductPropertieView(mContext);
                                    productPropertieView.bind(NutrimentType.BIO, "", "", SeverityType.GOOD);
                                    mProductPropertiesContainer.addView(productPropertieView);
                                    break;
                                }
                            }

                            if (!StringUtils.isNullOrEmpty(salt)) {
                                buildAndAddView(salt, NutrimentType.SALT);
                            }
                            String fat = nutriment.getFat();
                            if (!StringUtils.isNullOrEmpty(fat)) {
                                buildAndAddView(fat, NutrimentType.FAT);
                            }
                            String proteins = nutriment.getProteins();
                            if (!StringUtils.isNullOrEmpty(proteins)) {
                                buildAndAddView(proteins, NutrimentType.PROTEINS);
                            }

                            String sugars = nutriment.getSugars();
                            if (!StringUtils.isNullOrEmpty(sugars)) {
                                buildAndAddView(sugars, NutrimentType.SUGAR);
                            }

                            String energy = nutriment.getEnergyValue();
                            if (!StringUtils.isNullOrEmpty(energy)) {
                                buildAndAddView(energy, NutrimentType.ENERGIE);
                            }

                            if (!StringUtils.isNullOrEmpty(nutriment.getFiber())) {
                                buildAndAddView(nutriment.getFiber(), NutrimentType.FIBER);
                            }

                            String additivesN = mDbProduct.getAdditivesN();

                            if (!StringUtils.isNullOrEmpty(additivesN) && Integer.parseInt(additivesN) > 0) {
                                ProductPropertieView productPropertieView = new ProductPropertieView(mContext);
                                productPropertieView.bind(NutrimentType.ADDITIVE, additivesN, "", SeverityType.BAD);
                                mProductAdditivesContainer.addView(productPropertieView);
                                productPropertieView.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        getMainActivity().pushFragment(AdditivesFragment.newInstance(mDbProduct.getAdditivesTags()));
                                    }
                                });
                            } else {
                                mProductAdditivesContainer.setVisibility(View.GONE);
                            }
                        } else {
                            mProductPropertiesCard.setVisibility(View.GONE);
                        }
                    }
                });


            } else {
                mProductcontainer.setVisibility(View.GONE);
                mNoProductError.setVisibility(View.VISIBLE);
            }

        } else {
            mProduct = (Product) mIProduct;
            if (mProduct != null) {
                mProductTitle.setText(mProduct.getProductName());
                mProductSubtitle.setText(mProduct.getBrands());
                Glide.with(mProductImage.getContext())
                        .load(mProduct.getImageThumbUrl())
                        .apply(new RequestOptions().placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background))
                        .into(mProductImage);
                String nutritionGrades = mProduct.getNutritionGrades();
                if (!StringUtils.isNullOrEmpty(nutritionGrades)) {
                    mGrades.setText(nutritionGrades);
                    int gradeBackGround = NutrimentsUtils.getGradeBackGround(nutritionGrades);
                    mGrades.setBackground(ContextCompat.getDrawable(view.getContext(), gradeBackGround));
                } else {
                    mGrades.setVisibility(View.GONE);
                }
                Nutriments nutriments = mProduct.getNutriments();
                if (nutriments != null) {
                    String salt = nutriments.getSalt();
                    nutritionDataPer = mProduct.getNutritionDataPer();

                    for (String s : mProduct.getKeywords()) {
                        if (s.toLowerCase().equals("bio") || s.toLowerCase().equals("biologique") || s.toLowerCase().equals("biologic")) {
                            ProductPropertieView productPropertieView = new ProductPropertieView(mContext);
                            productPropertieView.bind(NutrimentType.BIO, "", "", SeverityType.GOOD);
                            mProductPropertiesContainer.addView(productPropertieView);
                            break;
                        }
                    }

                    if (!StringUtils.isNullOrEmpty(salt)) {
                        buildAndAddView(salt, NutrimentType.SALT);
                    }
                    String fat = nutriments.getFat();
                    if (!StringUtils.isNullOrEmpty(fat)) {
                        buildAndAddView(fat, NutrimentType.FAT);
                    }
                    String proteins = nutriments.getProteins();
                    if (!StringUtils.isNullOrEmpty(proteins)) {
                        buildAndAddView(proteins, NutrimentType.PROTEINS);
                    }

                    String sugars = nutriments.getSugars();
                    if (!StringUtils.isNullOrEmpty(sugars)) {
                        buildAndAddView(sugars, NutrimentType.SUGAR);
                    }

                    String energy = nutriments.getEnergyValue();
                    if (!StringUtils.isNullOrEmpty(energy)) {
                        buildAndAddView(energy, NutrimentType.ENERGIE);
                    }

                    if (!StringUtils.isNullOrEmpty(nutriments.getFiber())) {
                        buildAndAddView(nutriments.getFiber(), NutrimentType.FIBER);
                    }

                    String additivesN = mProduct.getAdditivesN();

                    if (!StringUtils.isNullOrEmpty(additivesN) && Integer.parseInt(additivesN) > 0) {
                        ProductPropertieView productPropertieView = new ProductPropertieView(mContext);
                        productPropertieView.bind(NutrimentType.ADDITIVE, additivesN, "", SeverityType.BAD);
                        mProductAdditivesContainer.addView(productPropertieView);
                        productPropertieView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                getMainActivity().pushFragment(AdditivesFragment.newInstance((ArrayList<String>) mProduct.getAdditivesTags()));
                            }
                        });
                    } else {
                        mProductAdditivesContainer.setVisibility(View.GONE);
                    }
                } else {
                    mProductPropertiesCard.setVisibility(View.GONE);
                }

            } else {
                mProductcontainer.setVisibility(View.GONE);
                mNoProductError.setVisibility(View.VISIBLE);
            }
        }


    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.product_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.info:
                View view = getLayoutInflater().inflate(R.layout.view_bottom_sheet_info, null);
                BottomSheetDialog dialog = new BottomSheetDialog(getContext());
                dialog.setContentView(view);
                dialog.show();
                break;
        }
        return true;
    }

    private void buildAndAddView(@NonNull final String propertie, @NonNull final NutrimentType nutrimentType) {
        ProductPropertieView productPropertieView = new ProductPropertieView(mContext);
        NutrimentQuality propertieQuality = NutrimentsUtils.getPropertieQuality(propertie, nutritionDataPer, nutrimentType);
        productPropertieView.bind(nutrimentType, propertie, propertieQuality.getmQualityTitle(), propertieQuality.getSeverityType());
        mProductPropertiesContainer.addView(productPropertieView);
    }

    private void addProductToDb() {
        DBNutriment dbNutriment = new DBNutriment();
        Nutriments nutriments = mProduct.getNutriments();
        dbNutriment.setCarbohydrates(nutriments.getCarbohydrates());
        dbNutriment.setEnergyValue(nutriments.getEnergyValue());
        dbNutriment.setFat(nutriments.getFat());
        dbNutriment.setFiber(nutriments.getFiber());
        dbNutriment.setSalt(nutriments.getSalt());
        dbNutriment.setProteins(nutriments.getProteins());
        dbNutriment.setSugars(nutriments.getSugars());
        DatabaseFacade.INSTANCE.insertNutriment(dbNutriment, new DatabaseFacade.DatabaseCallback<Long>() {
            @Override
            public void databaseCallback(@Nullable Long result) {
                final DBProduct dbProduct = new DBProduct();
                dbProduct.setId(Long.parseLong(mProduct.getCode()));
                dbProduct.setAdditivesTags((ArrayList<String>) mProduct.getAdditivesTags());
                dbProduct.setAdditivesN(mProduct.getAdditivesN());
                dbProduct.setNutrimentID(result);
                dbProduct.setBrands(mProduct.getBrands());
                dbProduct.setCountries(mProduct.getCountries());
                dbProduct.setImageFrontThumbUrl(mProduct.getImageFrontThumbUrl());
                dbProduct.setImageFrontUrl(mProduct.getImageFrontUrl());
                dbProduct.setImageSmallUrl(mProduct.getImageSmallUrl());
                dbProduct.setImageThumbUrl(mProduct.getImageThumbUrl());
                dbProduct.setIngredientsThatMayBeFromPalmOilN(mProduct.getIngredientsThatMayBeFromPalmOilN());
                dbProduct.setProductName(mProduct.getProductName());
                dbProduct.setProductNameEn(mProduct.getProductNameEn());
                dbProduct.setProductQuantity(mProduct.getProductQuantity());
                dbProduct.setServingQuantity(mProduct.getServingQuantity());
                dbProduct.setNutritionDataPer(mProduct.getNutritionDataPer());
                dbProduct.setNutritionGrades(mProduct.getNutritionGrades());
                dbProduct.setStores(mProduct.getStores());
                dbProduct.setKeywords((ArrayList<String>) mProduct.getKeywords());
                DatabaseFacade.INSTANCE.insertProduct(dbProduct, new DatabaseFacade.DatabaseCallback<Long>() {
                    @Override
                    public void databaseCallback(@Nullable Long result) {
                        Snackbar snackbar = Snackbar.make(mProductPropertiesContainer, R.string.snack_product_added, Snackbar.LENGTH_LONG);
                        snackbar.show();
                        FoodestoAppWidgetService.startActionUpdateRecipeWidgets(getContext(), dbProduct);
                    }
                });
            }
        });
    }
}
