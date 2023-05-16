package com.cesarbarrera.mybucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {


    private Item[] items;

    public ItemAdapter(Item[] items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_list, parent, false);


        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.bind(items[position]);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {

        private ImageView itemImage;

        private TextView itemTitle;

        private TextView itemDescription;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemImage = itemView.findViewById(R.id.image_view_item_picture);
            this.itemTitle = itemView.findViewById(R.id.text_view_list_item_title);
            this.itemDescription = itemView.findViewById(R.id.text_view_description);
        }

        public void bind(Item items) {
            itemTitle.setText(items.name);
            itemImage.setImageResource(items.image);
            itemDescription.setText(items.description);

        }
    }


}
