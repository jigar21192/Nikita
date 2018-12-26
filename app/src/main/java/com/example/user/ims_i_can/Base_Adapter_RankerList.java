package com.example.user.ims_i_can;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

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

        Model_Ranker_list model=list.get(i);
        s_name.setText(model.getS_name());
        s_std.setText(model.getS_std());
        s_per.setText(model.getS_per());


        return view;
    }
}
