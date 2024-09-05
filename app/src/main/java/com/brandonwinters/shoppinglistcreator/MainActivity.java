package com.brandonwinters.shoppinglistcreator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        if (navHostFragment != null) {
            NavController navController = navHostFragment.getNavController();
            NavigationUI.setupActionBarWithNavController(this, navController);
        }
        else {
            throw new IllegalStateException("NavHostFragment not found");
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = ((NavHostFragment)Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment))).getNavController();
        return navController.navigateUp() || super.onSupportNavigateUp();
    }
}
