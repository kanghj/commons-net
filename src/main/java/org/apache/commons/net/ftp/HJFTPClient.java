package org.apache.commons.net.ftp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;

public class HJFTPClient extends FTPClient {
	
	
	public static final String name1="webadmin";
	public static final String name2="ubuntu";
	public static final String name3="anonymous";
	public static final String pass1="asd";
	
	public void connect(InetAddress host, int port) throws SocketException, IOException {
		System.out.println("connect!");
		super.connect(InetAddress.getByName("127.0.0.1"), 2200);
	}

	/**
	 * Opens a Socket connected to a remote host at the specified port and
	 * originating from the current host at a system assigned port. Before
	 * returning, {@link #_connectAction_ _connectAction_() } is called to perform
	 * connection initialization actions.
	 * <p>
	 * 
	 * @param hostname The name of the remote host.
	 * @param port     The port to connect to on the remote host.
	 * @throws SocketException If the socket timeout could not be set.
	 * @throws IOException     If the socket could not be opened. In most cases you
	 *                         will only want to catch IOException since
	 *                         SocketException is derived from it.
	 * @throws                 java.net.UnknownHostException If the hostname cannot
	 *                         be resolved.
	 */
	public void connect(String hostname, int port) throws SocketException, IOException {
		connect(InetAddress.getByName("127.0.0.1"), 2200);
	}

	/**
	 * Opens a Socket connected to a remote host at the specified port and
	 * originating from the specified local address and port. Before returning,
	 * {@link #_connectAction_ _connectAction_() } is called to perform connection
	 * initialization actions.
	 * <p>
	 * 
	 * @param host      The remote host.
	 * @param port      The port to connect to on the remote host.
	 * @param localAddr The local address to use.
	 * @param localPort The local port to use.
	 * @throws SocketException If the socket timeout could not be set.
	 * @throws IOException     If the socket could not be opened. In most cases you
	 *                         will only want to catch IOException since
	 *                         SocketException is derived from it.
	 */
	public void connect(InetAddress host, int port, InetAddress localAddr, int localPort)
			throws SocketException, IOException {
		super.connect(InetAddress.getByName("127.0.0.1"), 2200, localAddr, localPort);
	}



	/**
	 * Opens a Socket connected to a remote host at the specified port and
	 * originating from the specified local address and port. Before returning,
	 * {@link #_connectAction_ _connectAction_() } is called to perform connection
	 * initialization actions.
	 * <p>
	 * 
	 * @param hostname  The name of the remote host.
	 * @param port      The port to connect to on the remote host.
	 * @param localAddr The local address to use.
	 * @param localPort The local port to use.
	 * @throws SocketException If the socket timeout could not be set.
	 * @throws IOException     If the socket could not be opened. In most cases you
	 *                         will only want to catch IOException since
	 *                         SocketException is derived from it.
	 * @throws                 java.net.UnknownHostException If the hostname cannot
	 *                         be resolved.
	 */
	public void connect(String hostname, int port, InetAddress localAddr, int localPort)
			throws SocketException, IOException {
		connect(InetAddress.getByName("127.0.0.1"), 2200);
	}

	/**
	 * Opens a Socket connected to a remote host at the current default port and
	 * originating from the current host at a system assigned port. Before
	 * returning, {@link #_connectAction_ _connectAction_() } is called to perform
	 * connection initialization actions.
	 * <p>
	 * 
	 * @param host The remote host.
	 * @throws SocketException If the socket timeout could not be set.
	 * @throws IOException     If the socket could not be opened. In most cases you
	 *                         will only want to catch IOException since
	 *                         SocketException is derived from it.
	 */
	public void connect(InetAddress host) throws SocketException, IOException {
		_hostname_ = null;
		connect(InetAddress.getByName("127.0.0.1"), 2200);
	}

	/**
	 * Opens a Socket connected to a remote host at the current default port and
	 * originating from the current host at a system assigned port. Before
	 * returning, {@link #_connectAction_ _connectAction_() } is called to perform
	 * connection initialization actions.
	 * <p>
	 * 
	 * @param hostname The name of the remote host.
	 * @throws SocketException If the socket timeout could not be set.
	 * @throws IOException     If the socket could not be opened. In most cases you
	 *                         will only want to catch IOException since
	 *                         SocketException is derived from it.
	 * @throws                 java.net.UnknownHostException If the hostname cannot
	 *                         be resolved.
	 */
	public void connect(String hostname) throws SocketException, IOException {
		connect(InetAddress.getByName("127.0.0.1"), 2200);
	}
}
