package org.xyzmst.demo.view;

import android.content.Context;
import android.widget.TextView;


import org.xyzmst.demo.R;
import org.xyzmst.demo.view.BaseCardFrameCard;

import butterknife.BindView;


/**
 * @author mac
 * @title SimpleView
 * @description
 * @modifier
 * @date
 * @since 2017/3/8 15:13
 **/
public class SimpleView extends BaseCardFrameCard<String> {


    @BindView(R.id.cotent_view)
    TextView mCotentView;

    public SimpleView(Context context) {
        super(context);
    }

    @Override
    public int Rid() {
        return R.layout.simple_view;
    }

    @Override
    public void setData(String s) {
        mCotentView.setText(s);
    }
}
