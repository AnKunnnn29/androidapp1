package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private final String[] tabs = {"Thông tin","Kỹ năng","Dự án","Liên hệ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }

        binding.collapsingToolbar.setTitle("");

        // Setup ViewPager and TabLayout
        binding.viewPager.setAdapter(new TabsAdapter(this));

        new TabLayoutMediator(binding.tabLayout, binding.viewPager,
                (tab, pos) -> tab.setText(tabs[pos])
        ).attach();

        // Post a request to re-layout the ViewPager after the initial layout pass.
        // This fixes the issue where the content is initially clipped.
        binding.viewPager.post(() -> {
            binding.viewPager.requestLayout();
        });
    }
}
