package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ContactFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        view.findViewById(R.id.email_button).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:tnumber696@gmail.com"));
            startActivity(intent);
        });

        view.findViewById(R.id.linkedin_button).setOnClickListener(v -> {
            // TODO: Replace with your actual LinkedIn profile URL
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/your-profile"));
            startActivity(intent);
        });

        view.findViewById(R.id.github_button).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/AnKunnnn29"));
            startActivity(intent);
        });

        view.findViewById(R.id.facebook_button).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ankunnnnnnn"));
            startActivity(intent);
        });

        return view;
    }
}
