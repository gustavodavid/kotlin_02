package gustavo.kotlin_02.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import gustavo.kotlin_02.Entidade.Produto
import gustavo.kotlin_02.R

class ProdutoAdapter(val context:Context, val dados:ArrayList<Produto>): RecyclerView.Adapter<ProdutoAdapter.ViewHolder>() {

    private val inflater: LayoutInflater = this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): ViewHolder {
        val view = this.inflater.inflate(R.layout.produto_adapter_item, viewGroup, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return this.dados.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.produtoNome.text = this.dados.get(position).nome
        viewHolder.produtoPreco.text = this.dados.get(position).preco
    }

    class ViewHolder(val view: View): RecyclerView.ViewHolder(view) {

        val produtoImageView: ImageView
        val produtoNome: TextView
        val produtoPreco: TextView

        init {
            produtoImageView = this.view.findViewById(R.id.produto_image_view)
            produtoNome = this.view.findViewById(R.id.produto_nome)
            produtoPreco = this.view.findViewById(R.id.produto_valor)
        }
    }

}