package me.everything.android.ui.overscroll.adapters;

import android.support.v4.widget.NestedScrollView;
import android.util.Log;
import android.view.View;

/**
 * @author trenail
 */
public class NestedScrollViewOverScrollDecorAdapter implements IOverScrollDecoratorAdapter {

    public static final String TAG = "OverScrollDecor";

    protected final NestedScrollView mView;

    public NestedScrollViewOverScrollDecorAdapter(NestedScrollView mView) {
        this.mView = mView;
    }

    @Override
    public View getView() {
        return mView;
    }

    @Override
    public boolean isInAbsoluteStart() {
        Log.d(TAG, "isInAbsoluteStart:" + !mView.canScrollVertically(-1));
        return !mView.canScrollVertically(-1);
    }

    @Override
    public boolean isInAbsoluteEnd() {
        Log.d(TAG, "isInAbsoluteEnd:" + !mView.canScrollVertically(1));
        return !mView.canScrollVertically(1);
    }

}
