package com.example.kotlin2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin2.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private PubgMobile pubg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initClicks();
    }

    private void initClicks() {
        binding.panBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.animalImg.setImageResource(R.drawable.pan);
                pubg = PubgMobile.PAN;
            }
        });

        binding.augBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.animalImg.setImageResource(R.drawable.aug);
                pubg = PubgMobile.AUG;
            }
        });

        binding.grazaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.animalImg.setImageResource(R.drawable.graza);
                pubg = PubgMobile.GRAZA;
            }
        });
        binding.dpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.animalImg.setImageResource(R.drawable.dp);
                pubg = PubgMobile.DP;
            }
        });


        binding.panBtnTost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pubg == PubgMobile.PAN) {
                    Toast.makeText(MainActivity.this, "Правильно!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не верно))", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.augBtnTost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pubg == PubgMobile.AUG) {
                    Toast.makeText(MainActivity.this, "Правильно!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не верно))", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.grazaBtnTost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pubg == PubgMobile.GRAZA) {
                    Toast.makeText(MainActivity.this, "Правильно!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не верно))", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.dpBtnTost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pubg == PubgMobile.DP) {
                    Toast.makeText(MainActivity.this, "Правильно!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не верно))", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String animalName;
                switch (pubg) {
                    case PAN:
                        animalName = "Pan";
                        break;

                    case AUG:
                        animalName = "Aug";
                        break;

                    case GRAZA:
                        animalName = "Graza";
                        break;
                    case DP:
                        animalName = "DpMainActivity";
                        break;

                    default:
                        animalName = "Неизвестно";
                        break;
                }

                intent.putExtra("key", animalName);
                startActivity(intent);

            }
        });
    }
}