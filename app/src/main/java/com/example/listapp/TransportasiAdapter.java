package com.example.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TransportasiAdapter extends BaseAdapter  {

    Context context;
    String[] alatTranportasi;
    String[] Jenis;
    String[] yangMengendalikan;
    LayoutInflater inflater;

    public TransportasiAdapter(Context context, String[] alatTranportasi, String[] jenis, String[] yangMengendalikan) {
        this.context = context;
        this.alatTranportasi = alatTranportasi;
        Jenis = jenis;
        this.yangMengendalikan = yangMengendalikan;
        this.inflater = (LayoutInflater.from(context)) ;
    }

    @Override
    public int getCount() {
        return alatTranportasi.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.list_alat_transportasi, null);
        TextView tvAlatTransportasi = (TextView) convertView.findViewById(R.id.tvAlatTransportasi);
        TextView tvJenis = (TextView) convertView.findViewById(R.id.tvJenis);
        TextView tvYangMengendalikan = (TextView) convertView.findViewById(R.id.tvYangMengendalikan);

        tvAlatTransportasi.setText(alatTranportasi[position]);
        tvJenis.setText(Jenis[position]);
        tvYangMengendalikan.setText(yangMengendalikan[position]+"");

        return convertView;
    }
}
