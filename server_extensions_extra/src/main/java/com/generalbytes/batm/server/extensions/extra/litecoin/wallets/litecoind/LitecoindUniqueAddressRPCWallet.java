/*************************************************************************************
 * Copyright (C) 2014-2019 GENERAL BYTES s.r.o. All rights reserved.
 *
 * This software may be distributed and modified under the terms of the GNU
 * General Public License version 2 (GPL2) as published by the Free Software
 * Foundation and appearing in the file GPL2.TXT included in the packaging of
 * this file. Please note that GPL2 Section 2[b] requires that all works based
 * on this software must also be made publicly available under the terms of
 * the GPL2 ("Copyleft").
 *
 * Contact information
 * -------------------
 *
 * GENERAL BYTES s.r.o.
 * Web      :  http://www.generalbytes.com
 *
 ************************************************************************************/
package com.generalbytes.batm.server.extensions.extra.litecoin.wallets.litecoind;

import com.generalbytes.batm.server.extensions.IGeneratesNewDepositCryptoAddress;

public class LitecoindUniqueAddressRPCWallet extends LitecoindRPCWallet implements IGeneratesNewDepositCryptoAddress {
    public LitecoindUniqueAddressRPCWallet(String rpcURL) {
        super(rpcURL, ""); // label is used only for reusing the same address
    }
}
