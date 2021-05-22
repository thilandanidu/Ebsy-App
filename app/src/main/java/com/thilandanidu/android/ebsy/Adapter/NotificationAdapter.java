package com.thilandanidu.android.ebsy.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.thilandanidu.android.ebsy.Model.notifications;
import com.thilandanidu.android.ebsy.R;
import com.thilandanidu.android.ebsy.interfaces.notificationClickLisner;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder> {

    private ArrayList<notifications> mNotificationsArrayList;
    private Activity activity;
    private notificationClickLisner clickLisner;

    public NotificationAdapter(Activity activity,ArrayList<notifications> notifications,notificationClickLisner<notifications> clickLisner){
        this.activity = activity;
        this.mNotificationsArrayList = notifications;
        this.clickLisner = clickLisner;
    }

    @NonNull
    @Override
    public NotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notification_layout, parent, false);
        return new NotificationViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationViewHolder holder, int position) {
        notifications nfy = mNotificationsArrayList.get(position);
        holder.mTvNotificationHeader.setText(nfy.getTitle());
        holder.mTvNotificationBody.setText(nfy.getDescription());

        /*if (nfy.getIs_read()==1){

        }else {

            holder.mTvNotificationIcon.setBackground(activity.getResources().getDrawable(R.drawable.ic_launcher_foreground));
        }*/
    }

    @Override
    public int getItemCount() {
        return mNotificationsArrayList.size();
    }

    public class NotificationViewHolder extends RecyclerView.ViewHolder {

        TextView mTvNotificationHeader, mTvNotificationBody,mTvNotificationIcon;
        CardView mCardView;

        public NotificationViewHolder(@NonNull View view) {
            super(view);

            mTvNotificationHeader = view.findViewById(R.id.notification_layout_header);
            mTvNotificationBody = view.findViewById(R.id.notification_layout_body);
            mTvNotificationIcon = view.findViewById(R.id.donater_notification_icon_tv);
            mCardView = view.findViewById(R.id.donater_notification_cart_view_icon);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final int position = NotificationViewHolder.this.getAdapterPosition();

                    clickLisner.notificationClick(position, mNotificationsArrayList.get(position));
                }
            });
        }
    }
}
