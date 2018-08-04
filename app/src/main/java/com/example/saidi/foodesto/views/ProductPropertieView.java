package com.example.saidi.foodesto.views;

import android.content.Context;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.models.NutrimentType;
import com.example.saidi.foodesto.models.SeverityType;
import com.example.saidi.foodesto.utils.StringUtils;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ProductPropertieView extends FrameLayout {
    @BindView(R.id.propertie_icon)
    protected ImageView mPropertieImage;
    @BindView(R.id.propertie_title)
    protected TextView mPropertieTitle;
    @BindView(R.id.propertie_value)
    protected TextView mPropertieValue;
    @BindView(R.id.propertie_quantity)
    protected TextView mPropertieQuantity;
    @BindView(R.id.propertie_severity)
    protected View mPropertieSeverity;

    public ProductPropertieView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public ProductPropertieView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ProductPropertieView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ProductPropertieView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(getLayoutId(), this);
        ButterKnife.bind(this);
    }

    private int getLayoutId() {
        return R.layout.view_product_propertie;
    }

    public void bind(@NonNull final NutrimentType nutrimentType, @Nullable final String quantity, @Nullable final String value, @NonNull SeverityType severityType) {
        if (!StringUtils.isNullOrEmpty(quantity)) {
            mPropertieQuantity.setText(quantity);
        } else {
            mPropertieQuantity.setVisibility(GONE);
        }

        if (!StringUtils.isNullOrEmpty(value)) {
            mPropertieValue.setText(value);
        } else {
            mPropertieValue.setVisibility(GONE);
        }
        setNutrimentTitleAndDrawable(nutrimentType);
        setSeverity(severityType);
    }

    private void setNutrimentTitleAndDrawable(@NonNull NutrimentType nutrimentType) {
        switch (nutrimentType) {
            case FAT:
                mPropertieTitle.setText(R.string.propertie_fat);
                setDrawable(R.drawable.ic_fat);
                break;
            case SALT:
                mPropertieTitle.setText(R.string.propertie_salt);
                setDrawable(R.drawable.ic_salt);
                break;
            case FIBER:
                mPropertieTitle.setText(R.string.propertie_fiber);
                setDrawable(R.drawable.ic_fiber);
                break;
            case SUGAR:
                mPropertieTitle.setText(R.string.propertie_sugar);
                setDrawable(R.drawable.ic_sugar);
                break;
            case ENERGIE:
                mPropertieTitle.setText(R.string.propertie_energy);
                setDrawable(R.drawable.ic_calories);
                break;
            case PROTEINS:
                mPropertieTitle.setText(R.string.propertie_proteins);
                setDrawable(R.drawable.ic_proteins);
                break;
            case CARBOHYDRATE:
                mPropertieTitle.setText(R.string.propertie_carbohydrate);
                setDrawable(R.drawable.ic_carbohydrate);
                break;
            case BIO:
                mPropertieTitle.setText(R.string.bio);
                setDrawable(R.drawable.ic_bio);
            case ADDITIVE:
                mPropertieTitle.setText(R.string.additives);
                setDrawable(R.drawable.ic_additive);
            default:
                break;
        }
    }

    private void setSeverity(@NonNull SeverityType severityType) {
        switch (severityType) {
            case BAD:
                mPropertieSeverity.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_red_circle));
                break;
            case GOOD:
                mPropertieSeverity.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_strong_green_circle));
                break;
            case MEDIOCR:
                mPropertieSeverity.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_orange_circle));
                break;
            case LOW_IMPACT:
                mPropertieSeverity.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_accent_green_circle));
                break;
        }
    }

    private void setDrawable(@DrawableRes int drawable) {
        Glide.with(getContext())
                .load(ContextCompat.getDrawable(getContext(), drawable))
                .apply(new RequestOptions().placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background))
                .into(mPropertieImage);
    }
}
