package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    private ArrayList<ExampleItem> mExampleList;
    Context context;

    public ExampleAdapter(Context context, ArrayList<ExampleItem> exampleList) {
        mExampleList = exampleList;
        this.context = context;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {

        ExampleItem currentItem = mExampleList.get(position);

        holder.Dhash.setText(currentItem.getMhashcode());
        holder.Dname.setText(currentItem.getMdevicename());
        holder.Did.setText(currentItem.getDevicerssi());
        holder.Daddress.setText(currentItem.getMdeviceaddress());
        holder.Dadvertising.setText(currentItem.getMrawdata().toString());

        holder.F1.setText(String.valueOf(currentItem.isMf1()));
        holder.F2.setText(String.valueOf(currentItem.isMf2()));
        holder.F3.setText(String.valueOf(currentItem.isMf3()));
        holder.F4.setText(String.valueOf(currentItem.isMf4()));
        holder.F5.setText(String.valueOf(currentItem.isMf5()));


        int type = currentItem.getType();

        if (type == 1) {
            holder.llibeacon.setVisibility(View.VISIBLE);
            // For ibeacon
            holder.Duuid.setText(currentItem.getMuuid().toString());
            holder.Dmajor.setText(String.valueOf(currentItem.getMmajor()));
            holder.Dminor.setText(String.valueOf(currentItem.getMminor()));
            holder.Dpower.setText(String.valueOf(currentItem.getMpower()));
        } else holder.llibeacon.setVisibility(View.GONE);

        if (type == 2) {
            holder.lleddystoneUID.setVisibility(View.VISIBLE);
            // For Eddystone UID
            holder.Dpower1.setText(String.valueOf(currentItem.getMpower1()));
            holder.Dnmaespace.setText(String.valueOf(currentItem.getMnamespaceId().getBytes(StandardCharsets.UTF_8).toString()));
            holder.Dinstance.setText(currentItem.getMinstanceId().toString());
            holder.Dbeacon.setText(currentItem.getMbeaconId().toString());
        } else holder.lleddystoneUID.setVisibility(View.GONE);

        if (type == 3) {
            holder.lleddystoneURL.setVisibility(View.VISIBLE);
            // For Eddystone URL
            holder.Dpower2.setText(String.valueOf(currentItem.getMpower2()));
            holder.Durl.setText(currentItem.getMurl().toString());
        } else holder.lleddystoneURL.setVisibility(View.GONE);

        if (type == 4) {
            holder.lleddystoneTLM.setVisibility(View.VISIBLE);
            // For Eddystone TLM
            holder.Dversion.setText(String.valueOf(currentItem.getMversion()));
            holder.Dvoltage.setText(String.valueOf(currentItem.getMvoltage()));
            holder.Dtemperature.setText(String.valueOf( currentItem.getMtemperature()));
            holder.Delapsed.setText(String.valueOf(currentItem.getMelapsed()));
            holder.Dcount.setText(String.valueOf(currentItem.getMcount()));

        } else holder.lleddystoneTLM.setVisibility(View.GONE);

        if (type == 5) {
            holder.lleddystoneEID.setVisibility(View.VISIBLE);
            // For Eddystone EID
            holder.Dpower3.setText(String.valueOf(currentItem.getMpower3()));
            holder.Deid.setText(currentItem.getMeid().toString());
        } else holder.lleddystoneEID.setVisibility(View.GONE);

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {

        // General specs
        public TextView Dhash;
        public TextView Did;
        public TextView Daddress;
        public TextView Dname;
        public TextView Dadvertising;

        // Flags
        public TextView F1;
        public TextView F2;
        public TextView F3;
        public TextView F4;
        public TextView F5;


        // For ibeacon
        public LinearLayout llibeacon;
        public TextView Duuid;
        public TextView Dmajor;
        public TextView Dminor;
        public TextView Dpower;

        // For Eddystone UID
        public LinearLayout lleddystoneUID;
        public TextView Dpower1;
        public TextView Dnmaespace;
        public TextView Dinstance;
        public TextView Dbeacon;

        // For Eddystone URL
        public LinearLayout lleddystoneURL;
        public TextView Dpower2;
        public TextView Durl;

        // For Eddystone TLM
        public LinearLayout lleddystoneTLM;
        public TextView Dversion;
        public TextView Dvoltage;
        public TextView Dtemperature;
        public TextView Delapsed;
        public TextView Dcount;

        // For Eddystone EID
        public LinearLayout lleddystoneEID;
        public TextView Dpower3;
        public TextView Deid;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            Dhash = itemView.findViewById(R.id.dhash);
            Did = itemView.findViewById(R.id.did);
            Daddress = itemView.findViewById(R.id.daddress);
            Dname = itemView.findViewById(R.id.dname);
            Dadvertising = itemView.findViewById(R.id.dadvertising);

            // Flags
            F1 = itemView.findViewById(R.id.f1);
            F2 = itemView.findViewById(R.id.f2);
            F3 = itemView.findViewById(R.id.f3);
            F4 = itemView.findViewById(R.id.f4);
            F5 = itemView.findViewById(R.id.f5);

            // For ibeacon
            llibeacon = itemView.findViewById(R.id.llibeacon);
            Duuid = itemView.findViewById(R.id.duuid);
            Dmajor = itemView.findViewById(R.id.dmajor);
            Dminor = itemView.findViewById(R.id.dminor);
            Dpower = itemView.findViewById(R.id.dpower);

            // For Eddystone UID
            lleddystoneUID = itemView.findViewById(R.id.lleddystoneUID);
            Dpower1 = itemView.findViewById(R.id.dpower1);
            Dnmaespace = itemView.findViewById(R.id.dnmaespace);
            Dinstance = itemView.findViewById(R.id.dinstance);
            Dbeacon = itemView.findViewById(R.id.dbeacon);

            // For Eddystone URL
            lleddystoneURL = itemView.findViewById(R.id.lleddystoneURL);
            Dpower2 = itemView.findViewById(R.id.dpower2);
            Durl = itemView.findViewById(R.id.durl);

            // For Eddystone TLM
            lleddystoneTLM = itemView.findViewById(R.id.lleddystoneTLM);
            Dversion = itemView.findViewById(R.id.dversion);
            Dvoltage = itemView.findViewById(R.id.dvoltage);
            Dtemperature = itemView.findViewById(R.id.dtemperature);
            Delapsed = itemView.findViewById(R.id.delapsed);
            Dcount = itemView.findViewById(R.id.dcount);

            // For Eddystone EID
            lleddystoneEID = itemView.findViewById(R.id.lleddystoneEID);
            Dpower3 = itemView.findViewById(R.id.dpower3);
            Deid = itemView.findViewById(R.id.deid);

        }
    }

}
