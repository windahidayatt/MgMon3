package com.example.mgmon3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class transaksiAdapter extends RecyclerView.Adapter<transaksiAdapter.AdapterViewHolder> {
    private ArrayList<transaksi> dataList;

    public transaksiAdapter(ArrayList<transaksi> dataList) {
        this.dataList = dataList;
    }

    @Override
    public AdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycleview_data, parent, false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterViewHolder holder, int position) {
        holder.txt_jenis.setText(dataList.get(position).getJenis_transaksi());
        holder.txt_tgl.setText(dataList.get(position).getTanggal_transaksi());
        holder.txt_label.setText(dataList.get(position).getLabel_transaksi());
        holder.txt_hasil.setText(Double.toString(dataList.get(position).getJumlah_transaksi()));
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_jenis, txt_tgl, txt_label, txt_hasil;

        public AdapterViewHolder(View itemView) {
            super(itemView);
            txt_jenis = (TextView) itemView.findViewById(R.id.txt_jenis);
            txt_tgl = (TextView) itemView.findViewById(R.id.txt_tgl);
            txt_label = (TextView) itemView.findViewById(R.id.txt_label);
            txt_hasil = (TextView) itemView.findViewById(R.id.txt_hasil);
        }
    }
}
