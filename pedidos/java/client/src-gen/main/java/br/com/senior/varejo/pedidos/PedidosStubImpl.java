/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import java.util.function.Supplier;

import br.com.senior.messaging.Message;
import br.com.senior.messaging.IMessenger;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;

import br.com.senior.varejo.pedidos.impl.*;
import java.util.concurrent.CompletableFuture;
import br.com.senior.varejo.pedidos.HelloWorldInput;
import br.com.senior.varejo.pedidos.HelloWorldOutput;
import br.com.senior.varejo.pedidos.GetMetadataInput;
import br.com.senior.varejo.pedidos.GetMetadataOutput;
import br.com.senior.varejo.pedidos.ImportClienteInput;
import br.com.senior.varejo.pedidos.ImportClienteOutput;
import br.com.senior.varejo.pedidos.ExportClienteInput;
import br.com.senior.varejo.pedidos.ExportClienteOutput;
import br.com.senior.varejo.pedidos.Cliente;
import br.com.senior.varejo.pedidos.CreateBulkClienteInput;
import br.com.senior.varejo.pedidos.CreateBulkClienteOutput;
import br.com.senior.varejo.pedidos.GetDependenciesOutput;
import br.com.senior.varejo.pedidos.ServiceStartedPayload;
import br.com.senior.varejo.pedidos.NotifyUserEventPayload;
import br.com.senior.varejo.pedidos.ImportClienteEventPayload;
import br.com.senior.varejo.pedidos.ExportClienteEventPayload;

/**
* 
*/
public class PedidosStubImpl implements PedidosStub {

	private final Supplier<IMessenger> messengerSupplier;

	private final UserIdentifier userId;

	private final Supplier<Message> messageSupplier;

	/**
	 * Use {@link #ManufaturaJsonStubImpl(MessengerSupplier, UserIdentifier, MessageSupplier)} instead.
	 */
	@Deprecated
	public PedidosStubImpl(IMessenger messenger, UserIdentifier userId) {
		this(new InstanceMessengerSupplier(messenger), userId, null);
	}

	/**
	 * @param messengerSupplier Supplies current service messenger.
	 * @param userId Provides tenant and user name to send or publish messages.
	 * @param messageSupplier Supplies current message being processed by service. Used to send messages by foolowup.
	 */
	public PedidosStubImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	/**
	* Chamada síncrona para o método helloWorld
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* 
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public HelloWorldOutput helloWorld(HelloWorldInput input, long timeout) {
		HelloWorldImpl impl = new HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorld(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método helloWorld
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* 
	*/
	@Override
	public void helloWorld(HelloWorldInput input) {
		HelloWorldImpl impl = new HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		impl.helloWorld(input);
	}
	
	/**
	* Chamada assíncrona para o método helloWorld
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* 
	*/
	@Override
	public CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input) {
		HelloWorldImpl impl = new HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorldRequest(input);
	}
	/**
	* Chamada síncrona para o método getMetadata
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public GetMetadataOutput getMetadata(GetMetadataInput input, long timeout) {
		GetMetadataImpl impl = new GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadata(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método getMetadata
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	*/
	@Override
	public void getMetadata(GetMetadataInput input) {
		GetMetadataImpl impl = new GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		impl.getMetadata(input);
	}
	
	/**
	* Chamada assíncrona para o método getMetadata
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	*/
	@Override
	public CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input) {
		GetMetadataImpl impl = new GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadataRequest(input);
	}
	/**
	* Chamada síncrona para o método importCliente
	* This is a public operation
	* 
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public ImportClienteOutput importCliente(ImportClienteInput input, long timeout) {
		ImportClienteImpl impl = new ImportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.importCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método importCliente
	* This is a public operation
	* 
	*/
	@Override
	public void importCliente(ImportClienteInput input) {
		ImportClienteImpl impl = new ImportClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.importCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método importCliente
	* This is a public operation
	* 
	*/
	@Override
	public CompletableFuture<ImportClienteOutput> importClienteRequest(ImportClienteInput input) {
		ImportClienteImpl impl = new ImportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.importClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método exportCliente
	* This is a public operation
	* 
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public ExportClienteOutput exportCliente(ExportClienteInput input, long timeout) {
		ExportClienteImpl impl = new ExportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método exportCliente
	* This is a public operation
	* 
	*/
	@Override
	public void exportCliente(ExportClienteInput input) {
		ExportClienteImpl impl = new ExportClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.exportCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método exportCliente
	* This is a public operation
	* 
	*/
	@Override
	public CompletableFuture<ExportClienteOutput> exportClienteRequest(ExportClienteInput input) {
		ExportClienteImpl impl = new ExportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método createCliente
	* This is a public operation
	* The 'create' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Cliente createCliente(Cliente input, long timeout) {
		CreateClienteImpl impl = new CreateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método createCliente
	* This is a public operation
	* The 'create' request primitive for the Cliente entity.
	*/
	@Override
	public void createCliente(Cliente input) {
		CreateClienteImpl impl = new CreateClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.createCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método createCliente
	* This is a public operation
	* The 'create' request primitive for the Cliente entity.
	*/
	@Override
	public CompletableFuture<Cliente> createClienteRequest(Cliente input) {
		CreateClienteImpl impl = new CreateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método createBulkCliente
	* This is a public operation
	* The 'createBulk' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public CreateBulkClienteOutput createBulkCliente(CreateBulkClienteInput input, long timeout) {
		CreateBulkClienteImpl impl = new CreateBulkClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método createBulkCliente
	* This is a public operation
	* The 'createBulk' request primitive for the Cliente entity.
	*/
	@Override
	public void createBulkCliente(CreateBulkClienteInput input) {
		CreateBulkClienteImpl impl = new CreateBulkClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método createBulkCliente
	* This is a public operation
	* The 'createBulk' request primitive for the Cliente entity.
	*/
	@Override
	public CompletableFuture<CreateBulkClienteOutput> createBulkClienteRequest(CreateBulkClienteInput input) {
		CreateBulkClienteImpl impl = new CreateBulkClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método createMergeCliente
	* This is a public operation
	* The 'createMerge' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Cliente createMergeCliente(Cliente input, long timeout) {
		CreateMergeClienteImpl impl = new CreateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método createMergeCliente
	* This is a public operation
	* The 'createMerge' request primitive for the Cliente entity.
	*/
	@Override
	public void createMergeCliente(Cliente input) {
		CreateMergeClienteImpl impl = new CreateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método createMergeCliente
	* This is a public operation
	* The 'createMerge' request primitive for the Cliente entity.
	*/
	@Override
	public CompletableFuture<Cliente> createMergeClienteRequest(Cliente input) {
		CreateMergeClienteImpl impl = new CreateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método retrieveCliente
	* This is a public operation
	* The 'retrieve' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Cliente retrieveCliente(Cliente.Id input, long timeout) {
		RetrieveClienteImpl impl = new RetrieveClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método retrieveCliente
	* This is a public operation
	* The 'retrieve' request primitive for the Cliente entity.
	*/
	@Override
	public void retrieveCliente(Cliente.Id input) {
		RetrieveClienteImpl impl = new RetrieveClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método retrieveCliente
	* This is a public operation
	* The 'retrieve' request primitive for the Cliente entity.
	*/
	@Override
	public CompletableFuture<Cliente> retrieveClienteRequest(Cliente.Id input) {
		RetrieveClienteImpl impl = new RetrieveClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método updateCliente
	* This is a public operation
	* The 'update' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Cliente updateCliente(Cliente input, long timeout) {
		UpdateClienteImpl impl = new UpdateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método updateCliente
	* This is a public operation
	* The 'update' request primitive for the Cliente entity.
	*/
	@Override
	public void updateCliente(Cliente input) {
		UpdateClienteImpl impl = new UpdateClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.updateCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método updateCliente
	* This is a public operation
	* The 'update' request primitive for the Cliente entity.
	*/
	@Override
	public CompletableFuture<Cliente> updateClienteRequest(Cliente input) {
		UpdateClienteImpl impl = new UpdateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método updateMergeCliente
	* This is a public operation
	* The 'updateMerge' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Cliente updateMergeCliente(Cliente input, long timeout) {
		UpdateMergeClienteImpl impl = new UpdateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método updateMergeCliente
	* This is a public operation
	* The 'updateMerge' request primitive for the Cliente entity.
	*/
	@Override
	public void updateMergeCliente(Cliente input) {
		UpdateMergeClienteImpl impl = new UpdateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método updateMergeCliente
	* This is a public operation
	* The 'updateMerge' request primitive for the Cliente entity.
	*/
	@Override
	public CompletableFuture<Cliente> updateMergeClienteRequest(Cliente input) {
		UpdateMergeClienteImpl impl = new UpdateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método deleteCliente
	* This is a public operation
	* The 'delete' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public void deleteCliente(Cliente.Id input, long timeout) {
		DeleteClienteImpl impl = new DeleteClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método deleteCliente
	* This is a public operation
	* The 'delete' request primitive for the Cliente entity.
	*/
	@Override
	public void deleteCliente(Cliente.Id input) {
		DeleteClienteImpl impl = new DeleteClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteCliente(input);
	}
	
	/**
	* Chamada síncrona para o método listCliente
	* This is a public operation
	* The 'list' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Cliente.PagedResults listCliente(Cliente.PageRequest input, long timeout) {
		ListClienteImpl impl = new ListClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.listCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método listCliente
	* This is a public operation
	* The 'list' request primitive for the Cliente entity.
	*/
	@Override
	public void listCliente(Cliente.PageRequest input) {
		ListClienteImpl impl = new ListClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.listCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método listCliente
	* This is a public operation
	* The 'list' request primitive for the Cliente entity.
	*/
	@Override
	public CompletableFuture<Cliente.PagedResults> listClienteRequest(Cliente.PageRequest input) {
		ListClienteImpl impl = new ListClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.listClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método getDependencies
	* This is a public operation
	* Returns a list with all dependencies from this service, along with their respective versions
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public GetDependenciesOutput getDependencies(long timeout) {
		GetDependenciesImpl impl = new GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependencies(timeout);
	}
	
	/**
	* Chamada assíncrona para o método getDependencies
	* This is a public operation
	* Returns a list with all dependencies from this service, along with their respective versions
	*/
	@Override
	public void getDependencies() {
		GetDependenciesImpl impl = new GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		impl.getDependencies();
	}
	
	/**
	* Chamada assíncrona para o método getDependencies
	* This is a public operation
	* Returns a list with all dependencies from this service, along with their respective versions
	*/
	@Override
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest() {
		GetDependenciesImpl impl = new GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependenciesRequest();
	}


	/**
	* Chamada assíncrona para o método publishServiceStarted
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishServiceStarted( ServiceStartedPayload input ) {
	
		Message message = new Message(userId.getTenant(), PedidosConstants.DOMAIN, PedidosConstants.SERVICE, PedidosConstants.Events.SERVICE_STARTED, DtoJsonConverter.toJSON(input));
		try {
			message.setUsername(userId.getUsername());
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new PedidosException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishNotifyUserEvent( NotifyUserEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), PedidosConstants.DOMAIN, PedidosConstants.SERVICE, PedidosConstants.Events.NOTIFY_USER_EVENT, DtoJsonConverter.toJSON(input));
		try {
			message.setUsername(userId.getUsername());
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new PedidosException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportClienteEvent
	* This is a public operation
	*/
	public void publishImportClienteEvent( ImportClienteEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), PedidosConstants.DOMAIN, PedidosConstants.SERVICE, PedidosConstants.Events.IMPORT_CLIENTE_EVENT, DtoJsonConverter.toJSON(input));
		try {
			message.setUsername(userId.getUsername());
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new PedidosException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportClienteEvent
	* This is a public operation
	*/
	public void publishExportClienteEvent( ExportClienteEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), PedidosConstants.DOMAIN, PedidosConstants.SERVICE, PedidosConstants.Events.EXPORT_CLIENTE_EVENT, DtoJsonConverter.toJSON(input));
		try {
			message.setUsername(userId.getUsername());
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new PedidosException("Erro ao enviar a mensagem", e);
		}
	}
	
}
