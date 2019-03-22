package gustavo.kotlin_02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import gustavo.kotlin_02.Adapter.ProdutoAdapter
import gustavo.kotlin_02.Entidade.Produto

class MainActivity : AppCompatActivity() {

    lateinit var produtoRecyclerView: RecyclerView

    var produtoArray: ArrayList<Produto> = ArrayList<Produto>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        popularListaProdutos()

        this.produtoRecyclerView = this.findViewById(R.id.produto_adapter_recycler_view)
        this.produtoRecyclerView.layoutManager = LinearLayoutManager(this)
        this.produtoRecyclerView.adapter = ProdutoAdapter(this, this.produtoArray)
    }

    private fun popularListaProdutos() {
        this.produtoArray.add(Produto("Pizza", "RS2,50"))
        this.produtoArray.add(Produto("Lasanha", "RS4,50"))
        this.produtoArray.add(Produto("Coca-Cola", "RS4,50"))
        this.produtoArray.add(Produto("Pepsi", "RS4,50"))
        this.produtoArray.add(Produto("Biscoito", "RS4,50"))
    }
}
