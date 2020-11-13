package com.core.data_04

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.core.data_04.models.Product
import kotlinx.android.synthetic.main.activity_main.*

class DetailActivity : AppCompatActivity() {


    private val miamiAutoURL = "http://leedavidsoncontentmanagementsystem1.com/miami_auto/core/bridge_line_1/index.php"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)

        //----------------------------------------------------------------------------------------------------------------------------------------------------------------
        //  Find Image that user clicked and use Glide to load that
        //  image into the imageView assosiated with this
        //  DetailActivity in the activity_detail.xml
        //
        val imageView = findViewById(R.id.imageView_2) as ImageView
        val photo = intent.getSerializableExtra(PHOTO) as Product?


        photo?.image.let {
            Glide.with(this).load("https://leedavidsoncontentmanagementsystem1.com/miami_auto/core/bridge_line_1/inventory_images/" + photo?.image)
                .into(imageView)
        }


        //---------------------------------------------------------------------------------------------------------------------------------------------------------
        //  PRODUCT NAME
        //
        //  With the correct photo being sent from the MainAdapter getPhoto() method
        //  using adapterPosition this is taken advantage of and the textViews in turn
        //  have their values assigned from the photo object here
        //
        photo?.product_name.let {
            val textView: TextView = findViewById(R.id.productName) as TextView
            textView.text = photo?.product_name
        }
        //---------------------------------------------------------------------------------------------------------------------------------------------------------


        //---------------------------------------------------------------------------------------------------------------------------------------------------------
        //  PRICE
        //
        //  With the correct photo being sent from the MainAdapter getPhoto() method
        //  using adapterPosition this is taken advantage of and the textViews in turn
        //  have their values assigned from the photo object here
        //
        photo?.price.let {
            val textView: TextView = findViewById(R.id.productPrice) as TextView
            var itemCost = String.format("%.2f", photo?.price)
            textView.text = "£" + itemCost.toString()
        }
        //---------------------------------------------------------------------------------------------------------------------------------------------------------


        //---------------------------------------------------------------------------------------------------------------------------------------------------------
        //  TOP SPEED
        //
        //  With the correct photo being sent from the MainAdapter getPhoto() method
        //  using adapterPosition this is taken advantage of and the textViews in turn
        //  have their values assigned from the photo object here
        //
        photo?.topSpeed.let {
            val textView: TextView = findViewById(R.id.productTopSpeed) as TextView
            textView.text = photo?.topSpeed
        }
        //---------------------------------------------------------------------------------------------------------------------------------------------------------


        //---------------------------------------------------------------------------------------------------------------------------------------------------------
        //  ENGINE SIZE
        //
        //  With the correct photo being sent from the MainAdapter getPhoto() method
        //  using adapterPosition this is taken advantage of and the textViews in turn
        //  have their values assigned from the photo object here
        //
        photo?.engineSize.let {
            val textView: TextView = findViewById(R.id.productEngixeSize) as TextView
            textView.text = photo?.engineSize
        }
        //---------------------------------------------------------------------------------------------------------------------------------------------------------


        //---------------------------------------------------------------------------------------------------------------------------------------------------------
        //  ZERO TO SIXTY
        //
        //  With the correct photo being sent from the MainAdapter getPhoto() method
        //  using adapterPosition this is taken advantage of and the textViews in turn
        //  have their values assigned from the photo object here
        //
        photo?.zeroSixty.let {
            val textView: TextView = findViewById(R.id.productZeroSixty) as TextView
            textView.text = photo?.zeroSixty
        }
        //---------------------------------------------------------------------------------------------------------------------------------------------------------


        //---------------------------------------------------------------------------------------------------------------------------------------------------------
        //  TRANSMISSION
        //
        //  With the correct photo being sent from the MainAdapter getPhoto() method
        //  using adapterPosition this is taken advantage of and the textViews in turn
        //  have their values assigned from the photo object here
        //
        photo?.transmission.let {
            val textView: TextView = findViewById(R.id.productTransmission) as TextView
            textView.text = photo?.transmission
        }
        //---------------------------------------------------------------------------------------------------------------------------------------------------------



        //---------------------------------------------------------------------------------------------------------------------------------------------------------
        //  DETAILS
        //
        //  With the correct photo being sent from the MainAdapter getPhoto() method
        //  using adapterPosition this is taken advantage of and the textViews in turn
        //  have their values assigned from the photo object here
        //
        photo?.details.let {
            val textView: TextView = findViewById(R.id.productDetails) as TextView
            textView.text = photo?.details
        }
        //---------------------------------------------------------------------------------------------------------------------------------------------------------




        imageView.setOnClickListener {
            finish()
        }
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------

    }

    companion object {
        val PHOTO ="PHOTO"  //  This is used as a key to pass in photos
    }

    fun miamiAutoUrl(view: View) {
        val miamiAutoUrlLink = Intent(Intent.ACTION_VIEW, Uri.parse(miamiAutoURL))
        startActivity(miamiAutoUrlLink)
    }
}

