package com.example.michele.ersupal.adapter;

import android.content.Context;
import android.support.design.widget.NavigationView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.michele.ersupal.R;
import com.example.michele.ersupal.model.ListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michele on 28/01/2017.
 */

public class DerpAdapter extends RecyclerView.Adapter<DerpAdapter.DerpHolder>{

    private List <ListItem> listData;
    private LayoutInflater inflater;

    private ItemClickCallback itemClickCallback;

    public interface ItemClickCallback extends NavigationView.OnNavigationItemSelectedListener {
        void onItemClick(int p);
        void onSecondaryIconClick(int p);

    }

    public void setItemClickCallback(final ItemClickCallback itemClickCallback){
        this.itemClickCallback =itemClickCallback;
    }

    public DerpAdapter(List<ListItem> listData, Context c){
        this.inflater = LayoutInflater.from(c);
        this.listData = listData;

    }

    @Override
    public DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.list_item,parent,false);


        return new DerpHolder(view);
    }

    @Override
    public void onBindViewHolder(DerpHolder holder, int position) {
        ListItem item = listData.get(position);
        holder.title.setText(item.getTitle());
        holder.subTitle.setText(item.getSubTitle());



        if(item.isFavoutire()){
            holder.secondaryIcon.setImageResource(R.drawable.ic_star_black_24dp);
        }else{
            holder.secondaryIcon.setImageResource(R.drawable.ic_star_border_black_24dp);
        }

    }
    public void setListData(ArrayList<ListItem> exerciseList){
        this.listData.clear();
        this.listData.addAll(exerciseList);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class DerpHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView title;
        private ImageView thumbnail;
        private ImageView secondaryIcon;
        private View container;
        private TextView subTitle;
        private TextView news;



        public DerpHolder(View itemView) {
            super(itemView);

            title= (TextView)itemView.findViewById(R.id.lbl_item_text);
            subTitle= (TextView)itemView.findViewById(R.id.lbl_item_sub_title);
            thumbnail= (ImageView) itemView.findViewById(R.id.im_item_icon);
            secondaryIcon= (ImageView) itemView.findViewById(R.id.im_item_icon_secondary);
            secondaryIcon.setOnClickListener(this);
            container= itemView.findViewById(R.id.cont_item_root);
            container.setOnClickListener(this);

        }
        @Override
        public void onClick(View v){
            if(v.getId() == R.id.cont_item_root){
                itemClickCallback.onItemClick(getAdapterPosition());
            }else{
                itemClickCallback.onSecondaryIconClick(getAdapterPosition());
            }
        }
    }


}
