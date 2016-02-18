package com.bidindia.bidindia.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.bidindia.bidindia.POJO.BidItem;
import com.bidindia.bidindia.R;

import java.util.ArrayList;

/**
 * Created by Prateek on 15-02-2016.
 */
public class BidListAdapter extends RecyclerView.Adapter<BidListAdapter.BidItemViewHolder> {


    private final Context mContext;
    private final ArrayList<BidItem> mBidItemList;
    private final LayoutInflater mInflater;

    public BidListAdapter(Context context, ArrayList<BidItem> bidItemList) {

        mContext = context;
        mBidItemList = bidItemList;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public BidItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = mInflater.inflate(R.layout.row_layout, parent, false);
        return new BidItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BidItemViewHolder holder, int position) {

        bindItem(holder, mBidItemList.get(position));

    }

    private void bindItem(BidItemViewHolder holder, BidItem bidItem) {
        holder.tvTitle.setText(bidItem.getTitle());
        holder.tvDescription.setText(bidItem.getDescription());
        holder.tvFivePointDescription.setText(bidItem.getFivePointDescription());
        holder.tvBidCost.setText("PayTm Cash " + bidItem.getBidPrice());
    }

    @Override
    public int getItemCount() {
        return mBidItemList.size();
    }


    protected static class BidItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private final TextView tvTitle;
        private final TextView tvDescription;
        private final TextView tvFivePointDescription;
        private final TextView tvBidCost;
        private final Spinner spQuantity;
        private final Button btnBid;

        public BidItemViewHolder(View itemView) {
            super(itemView);

            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvDescription = (TextView) itemView.findViewById(R.id.tv_description);
            tvFivePointDescription = (TextView) itemView.findViewById(R.id.tv_five_point_description);
            tvBidCost = (TextView) itemView.findViewById(R.id.tv_price_amount);
            spQuantity = (Spinner) itemView.findViewById(R.id.sp_quantity);
            btnBid = (Button) itemView.findViewById(R.id.btn_bid);

            btnBid.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            if (view.getId() == R.id.btn_bid) {
                int quantity = spQuantity.getSelectedItemPosition() + 1; // qunatity = selectedItemPosition + 1 (Since arrary start from 0 index)

            }
        }
    }
}
