package com.example.tg4grupo1.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tg4grupo1.Modelo.Steam;
import com.example.tg4grupo1.R;

import java.util.List;

public class SteamAdapter extends RecyclerView.Adapter<SteamAdapter.ViewHolder> {

    private List<Steam> paradas;
    private OnNoteListener onNoteListener;

    public SteamAdapter(List<Steam> paradas, OnNoteListener onNoteListener) {
        this.paradas = paradas;
        this.onNoteListener = onNoteListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.scrol_modelo, parent, false);
        return new ViewHolder(view, onNoteListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.campoId.setText(paradas.get(position).getId());
        holder.campoNombre.setText(paradas.get(position).getNombre());
//        holder.campoImagen.setImageBitmap();
    }

    @Override
    public int getItemCount() {
        return paradas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView campoId;
        public TextView campoNombre;
        OnNoteListener onNoteListener;

        public ViewHolder(@NonNull View itemView, OnNoteListener onNoteListener) {
            super(itemView);
            campoId = itemView.findViewById(R.id.tIdSteam);
            campoNombre = itemView.findViewById(R.id.tNombreSteam);
            this.onNoteListener = onNoteListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onNoteListener.onNoteClic(getAdapterPosition());
        }
    }

    public interface OnNoteListener {
        void onNoteClic(int posicion);
    }
}
