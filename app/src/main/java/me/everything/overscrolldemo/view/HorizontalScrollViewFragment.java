package me.everything.overscrolldemo.view;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;

import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;
import me.everything.overscrolldemo.R;

/**
 * @author amitd
 */
public class HorizontalScrollViewFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.horizontal_scroll_overscroll_demo, null, false);
        initHorizontalScrollView((HorizontalScrollView) fragmentView.findViewById(R.id.horizontal_scroll_view));
        return fragmentView;
    }

    private void initHorizontalScrollView(HorizontalScrollView scrollView) {
        OverScrollDecoratorHelper.setUpOverScroll(scrollView);
    }

}
