package test.simpleresources;


import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleResource extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
                
        String myString = getResources().getString(R.string.display);
        int myColor = getResources().getColor(R.color.prettyTextColor);
        float myDimen = getResources().getDimension(R.dimen.textPointSize);
        ColorDrawable myDraw = (ColorDrawable)getResources().getDrawable(R.drawable.greenDrawable);
        ImageView imgView = (ImageView)findViewById(R.id.imageView1);

        imgView.setImageDrawable(myDraw);
        //String[] flavors = getResources().getStringArray(R.array.flavors);

        TextView tv = (TextView)findViewById(R.id.txtView);
        tv.setTextSize(myDimen);
        tv.setTextColor(myColor);
        tv.setText(myString);

        
        
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.file:
                Toast.makeText(this,"You Selected File",Toast.LENGTH_LONG).show();
                break;

            case R.id.open:
                Toast.makeText(this,"You Selected Open",Toast.LENGTH_LONG).show();
                break;

            case R.id.close:
                Toast.makeText(this,"You Selected Close",Toast.LENGTH_LONG).show();
                break;
        }

        return  true;
    }
}