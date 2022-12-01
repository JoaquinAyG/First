package com.study.fundaments

import android.content.Intent
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.webkit.WebView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webview)
        registerForContextMenu(webView)

        val swipeLayout = findViewById<SwipeRefreshLayout>(R.id.swiper)

        swipeLayout.setOnRefreshListener {
            val toast0 = Toast.makeText(this@Main, "Hi there! I don't exist :)", Toast.LENGTH_LONG)
            toast0.show()
            webView.reload()
            swipeLayout.isRefreshing = false
        }

        webView.loadUrl("https://thispersondoesnotexist.com")
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.menu_context, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.copy -> {
                val toast1 = Toast.makeText(this@Main, "Item Copied", Toast.LENGTH_LONG)
                toast1.show()
                true
            }
            R.id.download -> {
                val toast2 = Toast.makeText(this@Main, "Item downloaded", Toast.LENGTH_LONG)
                toast2.show()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_appbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.copy -> {
                val toast3 = Toast.makeText(this@Main, "Copied", Toast.LENGTH_LONG)
                toast3.show()
                true
            }
            R.id.settings -> {
                val toast4 = Toast.makeText(this@Main, "Settings", Toast.LENGTH_LONG)
                toast4.show()
                true
            }
            R.id.bottom_app -> {
                val toast4 = Toast.makeText(this@Main, "To bottom ap", Toast.LENGTH_LONG)
                toast4.show()
                true
            }
            R.id.bottom_nav -> {
                val toast4 = Toast.makeText(this@Main, "To bottom nav", Toast.LENGTH_LONG)
                toast4.show()
                true
            }
            R.id.close -> {
                oppenLeaveDialog()
                true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun oppenLeaveDialog() {
        val builder = MaterialAlertDialogBuilder(this)
        builder.setTitle(R.string.leave)
        builder.setMessage(R.string.leave_dialog)
        builder.setIcon(R.drawable.ic_baseline_logout_24)
        builder.setCancelable(false)

        builder.setPositiveButton(R.string.logout) { dialog, which ->
            intent = Intent(this@Main, Login::class.java)
            startActivity(intent)
            dialog.dismiss()
        }

        builder.setNegativeButton(
            R.string.cancel
        ) { dialog, _ ->
            dialog.dismiss()
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}