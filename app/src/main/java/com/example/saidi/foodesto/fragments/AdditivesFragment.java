package com.example.saidi.foodesto.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.saidi.foodesto.BaseFragment;
import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.adapters.AdditivesAdapter;
import com.example.saidi.foodesto.models.Additive;
import com.example.saidi.foodesto.models.Additives;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class AdditivesFragment extends BaseFragment {

    private static final String EXTRA_ADDITIVES = "extra_additives";
    @BindView(R.id.additives_details_list)
    protected RecyclerView mAdditivesRv;
    private ArrayList<String> mAdditivesList;
    private List<Additive> mAdditives = new ArrayList<>();

    public static BaseFragment newInstance(@NonNull final ArrayList<String> additives) {
        final BaseFragment additiveFragment = new AdditivesFragment();
        final Bundle bundle = new Bundle();
        bundle.putStringArrayList(EXTRA_ADDITIVES, additives);
        additiveFragment.setArguments(bundle);
        return additiveFragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_additives_details;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        mAdditivesList = bundle.getStringArrayList(EXTRA_ADDITIVES);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        getBaseActivity().getSupportActionBar().setTitle(R.string.additivs_list);
        super.onViewCreated(view, savedInstanceState);
        mAdditivesRv.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        mAdditivesRv.setLayoutManager(
                layoutManager);
        mAdditivesRv.setNestedScrollingEnabled(false);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mAdditivesRv.getContext(),
                LinearLayoutManager.VERTICAL);
        mAdditivesRv.addItemDecoration(dividerItemDecoration);

        for (String additiveString : mAdditivesList) {
            String substring = additiveString.substring(additiveString.indexOf(":") + 1, additiveString.length());
            Additive additiveDetails = getAdditiveDetails(substring);
            if (additiveDetails != null) {
                mAdditives.add(additiveDetails);
            }
        }
        AdditivesAdapter additivesAdapter = new AdditivesAdapter(mAdditives);
        mAdditivesRv.setAdapter(additivesAdapter);
    }

    private Additive getAdditiveDetails(@NonNull final String additiveCode) {
        try {
            InputStream inputStream = getBaseActivity().getAssets().open("additifs.json");
            String s = inputStreamToString(inputStream);
            Gson gson = new Gson();
            Additives additives = gson.fromJson(s, Additives.class);
            for (Additive additive : additives.getAdditives()) {
                if (additive.getCode().toLowerCase().equals(additiveCode.toLowerCase())) {
                    return additive;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public String inputStreamToString(InputStream inputStream) {
        try {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes, 0, bytes.length);
            String json = new String(bytes);
            return json;
        } catch (IOException e) {
            return null;
        }
    }
}
