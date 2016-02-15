package com.bidindia.bidindia.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

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

    }

    @Override
    public int getItemCount() {
        return mBidItemList.size();
    }


    public static class BidItemViewHolder extends RecyclerView.ViewHolder {

        private final TextView tvTitle;
        private final TextView tvDescription;
        private final TextView tvFivePointDescription;
        private final TextView tvPriceAmount;
        private final Spinner spQuantity;
        private final Button btnBid;

        public BidItemViewHolder(View itemView) {
            super(itemView);

            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvDescription = (TextView) itemView.findViewById(R.id.tv_description);
            tvFivePointDescription = (TextView) itemView.findViewById(R.id.tv_five_point_description);
            tvPriceAmount = (TextView) itemView.findViewById(R.id.tv_price_amount);
            spQuantity = (Spinner) itemView.findViewById(R.id.sp_quantity);
            btnBid = (Button) itemView.findViewById(R.id.btn_bid);
        }
    }
}
