namespace SeniorSistemas.Varejo.Pedidos
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.Collections;
    using System.Collections.Generic;
    			
    ///<summary>
    /// Default blob reference type. Every service defines its own.
    ///</summary>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "22.1.1")]
    public class BlobReference
    {
        
        ///<summary>
        /// The domain the blob belongs to.
        ///</summary>
        public string DomainName { get; set; }
        
        ///<summary>
        /// The service the blob belongs to.
        ///</summary>
        public string ServiceName { get; set; }
        
        ///<summary>
        /// The basic id of the blob.
        ///</summary>
        public string TargetObjectId { get; set; }
        
        ///<summary>
        /// The id of the blob copy.
        ///</summary>
        public string TargetCopyId { get; set; }
        
        /// <summary>
        /// Constructor for BlobReference
        /// </summary>
        /// <param name="targetObjectId">
        ///<summary>
        /// The basic id of the blob.
        ///</summary>
        /// </param>
        public BlobReference(string targetObjectId)
        {
            this.TargetObjectId = targetObjectId;
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