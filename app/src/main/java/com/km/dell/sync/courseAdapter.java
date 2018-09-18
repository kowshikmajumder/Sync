package com.km.dell.sync;

import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;


public class courseAdapter extends RecyclerView.Adapter<courseAdapter.courseHolder> {
    private String[][] data;
    public courseAdapter(String[][] data){
        this.data=data;
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
    public courseHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.list_of_courses,parent,false);

        return new courseHolder(view);
    }

    @Override
    public void onBindViewHolder(courseHolder holder, int position) {
        String course=data[position][0];
        String courseNum=data[position][1];
        holder.tv.setText(course);
        holder.curseNumTV.setText(courseNum);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class courseHolder extends RecyclerView.ViewHolder {

        TextView tv;
        TextView curseNumTV;

        public courseHolder(View itemView) {

            super(itemView);
            /////////////////
//            this.setIsRecyclable(false);
            ////////////////

            tv=(TextView) itemView.findViewById(R.id.Course);

            curseNumTV=(TextView)itemView.findViewById(R.id.CourseNum);

            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
/*

                    Intent intent;
                    intent = new Intent(context,Activity2.class);
                    context.startActivity(intent);


*/

                    Intent intent=new Intent(view.getContext(), Activity2.class);

                    view.getContext().startActivity(intent);

                }
            });


            curseNumTV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
/*

                    Intent intent;
                    intent = new Intent(context,Activity2.class);
                    context.startActivity(intent);


*/

                    Intent intent=new Intent(view.getContext(), Activity2.class);

                    view.getContext().startActivity(intent);

                }
            });




            ///////////////a







        }
    }
}
