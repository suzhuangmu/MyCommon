package com.mycommon.su.ui.detail.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mycommon.su.R;
import com.mycommon.su.ui.detail.activity.InvestRecordActivity;
import com.mycommon.su.ui.detail.activity.ProductDetailActivity;

/**
 * Created by su on 2018/1/2.
 */

public class InvestDetailAdapter extends RecyclerView.Adapter<InvestDetailAdapter.DHolder> {
    private Context context;
    private int[] imags = new int[]{R.drawable.ic_detail_jieshao, R.drawable.ic_detail_xiangqing, R.drawable.ic_detail_jilu, R.drawable.ic_detail_changjian};
    private String[] strs = new String[]{"产品介绍","项目详情","投资记录","常见问题"};
    public InvestDetailAdapter(Context context){
        this.context = context;
    }
    @Override
    public DHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DHolder(View.inflate(context, R.layout.invest_detail_item, null));
    }

    @Override
    public void onBindViewHolder(DHolder holder, int position) {
        holder.refresh(position);
    }

    @Override
    public int getItemCount() {
        return imags.length;
    }

    public class DHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView;
        private ImageView iv_more;
        View itemView;
        public DHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            imageView = itemView.findViewById(R.id.iv_icon);
            textView = itemView.findViewById(R.id.tv_des);
            iv_more = itemView.findViewById(R.id.iv_d_more);
        }

        public void refresh(final int position){
            imageView.setImageResource(imags[position]);
            textView.setText(strs[position]);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (strs[position].equals("项目详情")){
                        context.startActivity(new Intent(context, ProductDetailActivity.class));
                    }else if (strs[position].equals("投资记录")){
                        context.startActivity(new Intent(context, InvestRecordActivity.class));
                    }
                }
            });
        }
    }
}
