namespace SeniorSistemas.Varejo.Pedidos
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.Collections;
    using System.Collections.Generic;
    			
    ///<summary>
    /// Output payload for command exportCliente
    ///</summary>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "22.1.1")]
    public class ExportClienteOutput
    {
        
        ///<summary>
        /// TBD
        ///</summary>
        public string ExportJobId { get; set; }
        
        /// <summary>
        /// Constructor for ExportClienteOutput
        /// </summary>
        /// <param name="exportJobId">
        ///<summary>
        /// TBD
        ///</summary>
        /// </param>
        public ExportClienteOutput(string exportJobId)
        {
            this.ExportJobId = exportJobId;
        }
        
        public virtual void Validate()
        {
        	Validate(new ArrayList());
        }
        
        internal virtual void Validate(IList validated)
        {
            PedidosValidator.Validate(this, validated);
        }
    }
}
