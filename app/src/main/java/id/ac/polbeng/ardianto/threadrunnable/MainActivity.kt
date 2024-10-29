package id.ac.polbeng.ardianto.threadrunnable

import android.annotation.SuppressLint
import android.os.AsyncTask
import android.os.Bundle
import android.os.Handler
import android.os.Message
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.ardianto.threadrunnable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    //private lateinit var mHandler: Handler = utk kode 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //mHandler = MyHandler() = utk kode 3 kelas handler


        binding.button.setOnClickListener {
        /**
        * Kode Runnable 1
         */
            /*val runnable = Worker()
            val thread = Thread(runnable)
            thread.start()
        }
    }

    inner class Worker : Runnable {
        override fun run() {
            killSomeTime()
        }
    }

    private fun killSomeTime() {
        for (i in 1..20) {
            Thread.sleep(2000)
            println("i: $i")
        }
    }
}*/
        /**
        * kode 2(mengupdate tampilan textview)
        */
        /*Thread {
            killSomeTime()
        }.start()
        }
    }
    private fun killSomeTime() {
        for (i in 1..20) {
            runOnUiThread {
                binding.textView.text = i.toString()
            }
            Thread.sleep(2000)
            println("i: $i")
        }
    }
}*/
            /**
             * kode 3(menggunakan kelas handler)
             */
            /*Thread {
                killSomeTime()
            }.start()
        }
    }
    @SuppressLint("HandlerLeak")
    inner class MyHandler : Handler() {
        override fun handleMessage(msg: Message) {
            binding.textView.text = msg.data?.getString("counter")
        }
    }
    private fun killSomeTime() {
        for (i in 1..20) {
            val msg = Message.obtain()
            msg.data.putString("counter", i.toString())
            mHandler.sendMessage(msg)
            Thread.sleep(2000)
            println("i: $i")
        }
    }
}*/
            /**
             * kode 4(kelas asyncTask)
             */
            Worker().execute()
        }
    }
    @SuppressLint("StaticFieldLeak")
    inner class Worker : AsyncTask<Void, String, Boolean>() {
        override fun doInBackground(vararg p0: Void?): Boolean {
            for (i in 1..20) {
                publishProgress(i.toString())
                Thread.sleep(2000)
            }
            return true
        }
        override fun onProgressUpdate(vararg values: String?) {
            binding.textView.text = values[0]
        }
        override fun onPostExecute(result: Boolean?) {
            println(result)
        }
    }
}

