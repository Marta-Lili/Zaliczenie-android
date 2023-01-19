package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.myexam.adapter.MainRecyclerAdapter;
import com.example.myexam.model.AllCategory;
import com.example.myexam.model.CategoryItem;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;
    private Button button3;
    private Spinner spinner;
    @Override
            protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner2);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.locations, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);

        {
            Button button = (Button) findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity2();
                }
            });
        }

        List<CategoryItem> categoryItemList = new ArrayList<>();
        categoryItemList.add(new CategoryItem(1, R.drawable.carbonara));
        categoryItemList.add(new CategoryItem(1, R.drawable.gnocchi));
        categoryItemList.add(new CategoryItem(1, R.drawable.margarita));
        categoryItemList.add(new CategoryItem(1, R.drawable.pasta));
        categoryItemList.add(new CategoryItem(1, R.drawable.pepperoni));
        categoryItemList.add(new CategoryItem(1, R.drawable.veget));

        List<CategoryItem> categoryItemList2 = new ArrayList<>();
        categoryItemList2.add(new CategoryItem(1, R.drawable.carbonara));
        categoryItemList2.add(new CategoryItem(1, R.drawable.gnocchi));
        categoryItemList2.add(new CategoryItem(1, R.drawable.margarita));
        categoryItemList2.add(new CategoryItem(1, R.drawable.pasta));
        categoryItemList2.add(new CategoryItem(1, R.drawable.pepperoni));
        categoryItemList2.add(new CategoryItem(1, R.drawable.veget));

        List<AllCategory> allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory("Popularne w tym tygodniu", categoryItemList));
        allCategoryList.add(new AllCategory("Polecane dla Ciebie", categoryItemList2));
        allCategoryList.add(new AllCategory("Popularne w tym tygodniu", categoryItemList));
        allCategoryList.add(new AllCategory("Polecane dla Ciebie", categoryItemList2));
        this.setMainCategoryRecycler(allCategoryList);
    }

    private void openActivity2() {
        Intent intent = new Intent (this, Activity2.class);
        startActivity(intent);

    }
    private void setMainCategoryRecycler(List<AllCategory> allCategoryList) {
        this.mainCategoryRecycler = (RecyclerView) this.findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        this.mainCategoryRecycler.setLayoutManager(layoutManager);
        this.mainRecyclerAdapter = new MainRecyclerAdapter(this, allCategoryList);
        this.mainCategoryRecycler.setAdapter(this.mainRecyclerAdapter);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String choice = parent.getItemAtPosition(position).toString();
        Toast.makeText(getApplicationContext(),choice, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}