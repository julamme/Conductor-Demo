package com.juhanilammi.conductordemo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.juhanilammi.conductordemo.R;

import java.util.List;

/**
 * Created by lammi on 18.12.2016.
 */
public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.ViewHolder> {

    private List<String> data;

    public DemoAdapter(List<String> data) {
        this.data = data;
    }

    @Override
    public DemoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.simple_list_item_text, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(data.get(holder.getAdapterPosition()));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.item_text);
        }
    }
}
