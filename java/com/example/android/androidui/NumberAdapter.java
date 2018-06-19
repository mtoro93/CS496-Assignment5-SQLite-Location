package com.example.android.androidui;

/**
 * Created by eisat on 2/17/2018.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberAdapterViewHolder>{

    private String mNumbersList[];

    public NumberAdapter() {
        super();
    }

    @Override
    public void onBindViewHolder(NumberAdapter.NumberAdapterViewHolder holder, int position) {
        String number = mNumbersList[position];
        holder.mNumberTextView.setText(number);
    }

    @Override
    public int getItemCount() {
        return mNumbersList.length;
    }

    public class NumberAdapterViewHolder extends RecyclerView.ViewHolder {
        public final TextView mNumberTextView;
        public NumberAdapterViewHolder(View view) {
            super(view);
            mNumberTextView = (TextView) view.findViewById(R.id.number_view);
        }
    }

    @Override
    public NumberAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.number_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutIdForListItem, viewGroup, false);
        return new NumberAdapterViewHolder(view);
    }

    public void setNumberData(String[] numberData) {
        mNumbersList = numberData;
        notifyDataSetChanged();
    }
}
