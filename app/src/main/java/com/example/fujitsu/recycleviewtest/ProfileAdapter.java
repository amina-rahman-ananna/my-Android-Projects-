package com.example.fujitsu.recycleviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by FUJITSU on 2/21/2017.
 */

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileAdapterVH> {

    ArrayList<ProfileInfo> profileInfos = new ArrayList<>();

    ProfileAdapter(ArrayList<ProfileInfo> profileInfos){
        this.profileInfos = profileInfos;
    }


    @Override
    public ProfileAdapterVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycleview_row, parent, false);

        return new ProfileAdapter.ProfileAdapterVH(itemView);
    }

    @Override
    public void onBindViewHolder(ProfileAdapterVH holder, int position) {
        holder.tvName.setText(profileInfos.get(position).getName());
        holder.tvText.setText(profileInfos.get(position).getText());
    }


    public void add(ProfileInfo profileInfo, int position){
        profileInfos.add(profileInfo);
        notifyItemInserted(position);
    }

    @Override
    public int getItemCount() {
        return profileInfos.size();
    }

    public class ProfileAdapterVH extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvName,tvText;
        public ProfileAdapterVH(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.ivProfilePic);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvText = (TextView) itemView.findViewById(R.id.tvText);
        }
    }
}
