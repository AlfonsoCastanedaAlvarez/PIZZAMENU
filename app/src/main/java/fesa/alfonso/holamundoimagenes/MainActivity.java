package fesa.alfonso.holamundoimagenes;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.GenericLifecycleObserver;
import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageButton imageButton;

    String url = "https://images.pexels.com/photos/36181249/pexels-photo-36181249.jpeg";
    String url2 = "https://t41kw81t-3000.usw3.devtunnels.ms/images/menus/breads.png";
    String url3 = "https://t41kw81t-3000.usw3.devtunnels.ms/images/menus/chicken.png";
    String url4 = "https://t41kw81t-3000.usw3.devtunnels.ms/images/menus/dessert.png";
    String url5 = "https://t41kw81t-3000.usw3.devtunnels.ms/images/menus/drinks.png";
    String url6 = "https://t41kw81t-3000.usw3.devtunnels.ms/images/menus/pizza.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageView = findViewById(R.id.imageView);
        Glide.with(this).load(url).into(imageView);

        ImageButton imageButton = findViewById(R.id.imageButton);
        Glide.with(this).load(url2).into(imageButton);

        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        Glide.with(this).load(url3).into(imageButton2);

        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        Glide.with(this).load(url4).into(imageButton3);

        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        Glide.with(this).load(url5).into(imageButton4);

        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        Glide.with(this).load(url6).into(imageButton5);
    }

    public void saludar(View view){
        Toast.makeText(this, "Hola", Toast.LENGTH_SHORT).show();
    }
}