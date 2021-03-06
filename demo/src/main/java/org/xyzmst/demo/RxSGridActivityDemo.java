package org.xyzmst.demo;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import org.xyzmst.demo.view.SimpleView;
import org.xyzmst.rxlist.RxBaseData;
import org.xyzmst.rxlist.adapter.RxSimpleViewHolder;
import org.xyzmst.rxlist.util.RxSGridActivity;

import java.util.ArrayList;

import rx.Observable;


/**
 * @author mac
 * @title RxSGridActivityDemo
 * @description
 * @modifier
 * @date
 * @since 2017/3/12 22:55
 **/
public class RxSGridActivityDemo extends RxSGridActivity<String> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTitle.setText("RxSGridActivityDemo");
    }

    @Override
    public int getItemViewType(Object data, int position) {
        return 0;
    }

    @Override
    public RecyclerView.ViewHolder bindView(ViewGroup parent, int viewType) {
        return new RxSimpleViewHolder(new SimpleView(RxSGridActivityDemo.this));
    }

    @Override
    public Observable<RxBaseData<String>> bindData() {
        RxBaseData<String> rxBaseData = new RxBaseData<String>();
        rxBaseData.list = new ArrayList<String>();
        for (int i = 0; i < 40; i++) {
            rxBaseData.list.add(mFragment.cursor / 40 + "" + i);
        }
        rxBaseData.count = 100;
        return Observable.just(rxBaseData);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, String item, int position) {
        ((SimpleView) holder.itemView).setData(item);
    }


}
