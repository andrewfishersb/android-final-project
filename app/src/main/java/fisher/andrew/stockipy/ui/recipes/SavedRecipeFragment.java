package fisher.andrew.stockipy.ui.recipes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fisher.andrew.stockipy.R;


public class SavedRecipeFragment extends Fragment {


    public SavedRecipeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_saved_recipe, container, false);
    }

}