namespace SeniorSistemas.Varejo.Pedidos
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.IO;
    using System.Reflection;

    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "22.1.1")]
    public class GetMetadataImpl : IGetMetadata
    {
    	public GetMetadataOutput GetMetadata(GetMetadataInput request)
    	{
        	string format = (String.IsNullOrEmpty(request.MetadataFormat)) ? "sd.xml" : request.MetadataFormat;
        	var resourceName = "metadata/pedidos." + format;
        	using (Stream stream = Assembly.GetExecutingAssembly().GetManifestResourceStream(resourceName))
        	{
            	if (stream == null)
            	{
                	throw new FileNotFoundException(resourceName);
            	}
            	using (StreamReader reader = new StreamReader(stream))
            	{
                	return new GetMetadataOutput(reader.ReadToEnd());
            	}
        	}
    	}
    }
}
