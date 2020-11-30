package com.example.costaricaeducationproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfFragment extends Fragment {


    String pdf;
    String subject;
    Boolean downloaded;


    PDFView mPDFView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pdf_fragment, container, false);

        Bundle bundle = this.getArguments();
        subject = bundle.getString("subject");
        pdf = bundle.getString("pdf");
        downloaded = bundle.getBoolean("downloaded");

        if(downloaded){
            mPDFView = (PDFView) view.findViewById(R.id.pdfView);
            mPDFView.fromAsset(pdf).load();
        } else{
            Toast.makeText(getActivity(), pdf + " - Downloaded",
                    Toast.LENGTH_LONG).show();
        }



        return view;
    }


}
