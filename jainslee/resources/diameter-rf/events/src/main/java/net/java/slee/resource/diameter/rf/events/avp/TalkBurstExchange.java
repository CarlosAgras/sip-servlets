/*
 * JBoss, Home of Professional Open Source
 * 
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a full listing
 * of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU General Public License, v. 2.0.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License,
 * v. 2.0 along with this distribution; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */
package net.java.slee.resource.diameter.rf.events.avp;

import net.java.slee.resource.diameter.base.events.avp.GroupedAvp;

/**
 * Defines an interface representing the Talk-Burst-Exchange grouped AVP type.<br>
 * <br>
 * From the Diameter Rf Reference Point Protocol Details (3GPP TS 32.299 V7.1.0) specification:
 * <pre>
 * 7.2.108 Talk-Burst-Exchange AVP 
 * The Talk-Burst-Exchange AVP (AVP code 860) is of type Grouped and holds the talk burst related charging data. 
 * 
 * It has the following ABNF grammar: 
 *  Talk-Burst-Exchange ::= AVP Header: 860 
 *      [ Number-Of-Talk-Bursts ] #exclude 
 *      [ Talk-Burst-Volume ] #exclude 
 *      [ Talk-Bursts-Time ] #exclude 
 *      [ Number-Of-Received-Talk-Bursts ] #exclude 
 *      [ Received-Talk-Burst-Volume ] #exclude 
 *      [ Received-Talk-Burst-Time ] #exclude
 * </pre>
 * 
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 */
public interface TalkBurstExchange extends GroupedAvp {
  // Do we need this?
}