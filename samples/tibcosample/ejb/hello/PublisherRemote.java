/*
 * Copyright (c) 2004, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package hello;

import javax.ejb.*;
import java.rmi.RemoteException;


/**
 * Remote interface for Publisher enterprise bean. Declares one
 * business method.
 */
public interface PublisherRemote extends EJBObject {
    void publishNews(String Name,String Quantity,String Date) throws RemoteException;
}
