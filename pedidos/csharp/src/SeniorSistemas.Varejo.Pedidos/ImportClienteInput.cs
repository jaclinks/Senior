namespace SeniorSistemas.Varejo.Pedidos
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.Collections;
    using System.Collections.Generic;
    			
    ///<summary>
    /// Input payload for command importCliente
    ///</summary>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "22.1.1")]
    public class ImportClienteInput
    {
        
        ///<summary>
        /// TBD
        ///</summary>
        public ImportConfig Config { get; set; }
        
        /// <summary>
        /// Constructor for ImportClienteInput
        /// </summary>
        /// <param name="config">
        ///<summary>
        /// TBD
        ///</summary>
        /// </param>
        public ImportClienteInput(ImportConfig config)
        {
            this.Config = config;
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
