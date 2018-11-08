namespace SeniorSistemas.Varejo.Pedidos
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.Collections;
    using System.Collections.Generic;
    			
    ///<summary>
    /// Output payload for command createBulkCliente
    ///</summary>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "22.1.1")]
    public class CreateBulkClienteOutput
    {
        
        
        /// <summary>
        /// Constructor for CreateBulkClienteOutput
        /// </summary>
        public CreateBulkClienteOutput()
        {
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
