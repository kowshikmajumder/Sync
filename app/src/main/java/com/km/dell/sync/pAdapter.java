package com.km.dell.sync;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class pAdapter extends RecyclerView.Adapter<pAdapter.pHolder> {
    public static int totalSudents =0;
    private String[][] data;
    private Context context;

    public  pAdapter(Context context, String[]... data){
        this.data=data;
        this.context=context;

    }


    ////////////////////

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }









    /////////////////////
    @Override
    public pHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.list_item_laout,parent,false);

        return new pHolder(view);
    }

    @Override
    public void onBindViewHolder(pHolder holder, int position) {
    String title=data[position][0];
        String rolls=data[position][1];
        String dates=data[position][2];
        String  percents=data[position][3];
    holder.tv.setText(title);
    holder.rollrv.setText(rolls);
    holder.datetv.setText(dates);
    holder.ptv.setText(percents);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class pHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tv;
        TextView rollrv;
        TextView datetv;
        TextView ptv;
        CheckBox cb;


        public pHolder(View itemView) {

            super(itemView);
            /////////////////
//            this.setIsRecyclable(false);
            ////////////////

            img=(ImageView) itemView.findViewById(R.id.imgIcon);

            tv=(TextView) itemView.findViewById(R.id.textTitle);

            rollrv = (TextView) itemView.findViewById(R.id.roll);
            datetv=(TextView) itemView.findViewById(R.id.date);
            ptv=(TextView) itemView.findViewById(R.id.percent);
            cb =(CheckBox)itemView.findViewById(R.id.checkBox);



            ////////aaaaaaaa
            cb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    /////////////////////////
                    boolean ischecked=cb.isChecked();
                    if(ischecked)
                    {
                        cb.setText("Present");
                        totalSudents =totalSudents+1;
                    }
                    else
                    {
                        cb.setText("Absent");
                        totalSudents =totalSudents -1;
                    }
/////////

                    TextView totalStudentsTV = (TextView) ((Activity)context).findViewById(R.id.TotalPresentTV);
                    String totalSudentsStr ="";
                    if(totalSudents<10){
                        totalSudentsStr="0";
                    }
                    totalSudentsStr =totalSudentsStr+totalSudents;

                    totalStudentsTV.setText("Totol present students ="+totalSudentsStr);

                    ////////

                }
            });
                    ///////////////a







        }
    }
}
