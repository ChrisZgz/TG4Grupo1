package com.example.tg4grupo1.AlertDialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tg4grupo1.R;

public class AlertDialog extends AppCompatActivity {
    private static androidx.appcompat.app.AlertDialog dialogProgress;

    public static void AlertProgres(Context context) {
        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.alert_cargando, null);
        builder.setView(view);
        dialogProgress = builder.create();
        dialogProgress.setCanceledOnTouchOutside(false);
        dialogProgress.show();
    }

    public static void AlertError(Context context, String contenido) {
        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.alert_error, null);
        TextView textView = view.findViewById(R.id.textView5);
        textView.setText(contenido);
        builder.setView(view);
        androidx.appcompat.app.AlertDialog dialog = builder.create();
        dialog.show();

    }

    public static void AlertProgressCerrar() {
        dialogProgress.dismiss();
    }
}
