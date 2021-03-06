package ysn.com.demo.divider;

import android.content.Context;
import android.support.annotation.ColorRes;
import android.support.annotation.Nullable;

import ysn.com.demo.R;
import ysn.com.recyclerview.BaseItemDecoration;
import ysn.com.recyclerview.RvItemDecoration;
import ysn.com.recyclerview.RvItemDecorationBuilder;

/**
 * @Author yangsanning
 * @ClassName LinearLayoutDivider
 * @Description 一句话概括作用
 * @Date 2019/8/5
 * @History 2019/8/5 author: description:
 */
public class LinearLayoutDivider extends BaseItemDecoration {

    private Context context;
    private float width;

    public LinearLayoutDivider(Context context) {
        this.context = context;
        width = context.getResources().getDimension(R.dimen.dp5);
    }

    @Nullable
    @Override
    public RvItemDecoration getRvItemDecoration(int itemPosition) {
        return new RvItemDecorationBuilder()
            .buildLeft(getColor(R.color.divider_left), width, -width, -width)
            .buildTop(getColor(R.color.divider_top), width)
            .buildRight(getColor(R.color.divider_right), width, -width, -width)
            .buildBottom(getColor(R.color.divider_bottom), width)
            .finish();
    }

    private int getColor(@ColorRes int colorRes) {
        return context.getResources().getColor(colorRes);
    }
}
