package com.example.user.ims_i_can;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

public class Base_Adapter_RankerList extends BaseAdapter {
    Context context;
    List<Model_Ranker_list>list;
    LayoutInflater inflater;
    public Base_Adapter_RankerList(Context context, List<Model_Ranker_list> list) {
        this.context=context;
        this.list=list;
        inflater=LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.rankerlistitem,null);
        TextView s_name=view.findViewById(R.id.sname);
        TextView s_std=view.findViewById(R.id.s_std);
        TextView s_per=view.findViewById(R.id.s_per);
        ImageView s_pick=view.findViewById(R.id.stu1);

        Model_Ranker_list model=list.get(i);
        s_name.setText(model.getS_name());
        s_std.setText(model.getS_std());
        s_per.setText(model.getS_per());

        Glide.with(context).load(model.s_pick)
                .thumbnail(0.5f)
                .override(50,50)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(s_pick);



        return view;
    }
}
