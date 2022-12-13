class EntryActivity : AppCompatActivity(){
  private lateint var nameEntryView: EditText
  private lateint var amountEntryView: EditText
  private lateint var submitButtonView: Button
  
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_entry)
    
    nameEntryView = findViewById<EditText>(R.id.etNameInput)
    amountEntryView = findViewById<EditText>(R.id.etAmountInput)
    submitButtonView = findViewById<Button>(R.id.bntSubmitNewLiquid) 
    
    submitButtonView.setOnClickListener{
      log.d(tag:"EntryActivity",msg""submit clicked"
      val intent = LIQUID(nameEntryView.text.toString(),amountEntryView,text.toString().toLong())
      intent.putExtra(ENTRY_EXTRA,liquis) 
      this.startActivity(intent) 
            }
            }
}
