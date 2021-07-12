/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkDkim {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkDkim(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkDkim obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkDkim(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkDkim() {
    this(chilkatJNI.new_CkDkim(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkDkim_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkDkim_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkDkim_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_EventCallbackObject(CkBaseProgress progress) {
    chilkatJNI.CkDkim_put_EventCallbackObject(swigCPtr, this, CkBaseProgress.getCPtr(progress), progress);
  }

  public boolean get_AbortCurrent() {
    return chilkatJNI.CkDkim_get_AbortCurrent(swigCPtr, this);
  }

  public void put_AbortCurrent(boolean newVal) {
    chilkatJNI.CkDkim_put_AbortCurrent(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkDkim_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkDkim_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkDkim_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_DkimAlg(CkString str) {
    chilkatJNI.CkDkim_get_DkimAlg(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String dkimAlg() {
    return chilkatJNI.CkDkim_dkimAlg(swigCPtr, this);
  }

  public void put_DkimAlg(String newVal) {
    chilkatJNI.CkDkim_put_DkimAlg(swigCPtr, this, newVal);
  }

  public int get_DkimBodyLengthCount() {
    return chilkatJNI.CkDkim_get_DkimBodyLengthCount(swigCPtr, this);
  }

  public void put_DkimBodyLengthCount(int newVal) {
    chilkatJNI.CkDkim_put_DkimBodyLengthCount(swigCPtr, this, newVal);
  }

  public void get_DkimCanon(CkString str) {
    chilkatJNI.CkDkim_get_DkimCanon(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String dkimCanon() {
    return chilkatJNI.CkDkim_dkimCanon(swigCPtr, this);
  }

  public void put_DkimCanon(String newVal) {
    chilkatJNI.CkDkim_put_DkimCanon(swigCPtr, this, newVal);
  }

  public void get_DkimDomain(CkString str) {
    chilkatJNI.CkDkim_get_DkimDomain(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String dkimDomain() {
    return chilkatJNI.CkDkim_dkimDomain(swigCPtr, this);
  }

  public void put_DkimDomain(String newVal) {
    chilkatJNI.CkDkim_put_DkimDomain(swigCPtr, this, newVal);
  }

  public void get_DkimHeaders(CkString str) {
    chilkatJNI.CkDkim_get_DkimHeaders(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String dkimHeaders() {
    return chilkatJNI.CkDkim_dkimHeaders(swigCPtr, this);
  }

  public void put_DkimHeaders(String newVal) {
    chilkatJNI.CkDkim_put_DkimHeaders(swigCPtr, this, newVal);
  }

  public void get_DkimSelector(CkString str) {
    chilkatJNI.CkDkim_get_DkimSelector(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String dkimSelector() {
    return chilkatJNI.CkDkim_dkimSelector(swigCPtr, this);
  }

  public void put_DkimSelector(String newVal) {
    chilkatJNI.CkDkim_put_DkimSelector(swigCPtr, this, newVal);
  }

  public void get_DomainKeyAlg(CkString str) {
    chilkatJNI.CkDkim_get_DomainKeyAlg(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String domainKeyAlg() {
    return chilkatJNI.CkDkim_domainKeyAlg(swigCPtr, this);
  }

  public void put_DomainKeyAlg(String newVal) {
    chilkatJNI.CkDkim_put_DomainKeyAlg(swigCPtr, this, newVal);
  }

  public void get_DomainKeyCanon(CkString str) {
    chilkatJNI.CkDkim_get_DomainKeyCanon(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String domainKeyCanon() {
    return chilkatJNI.CkDkim_domainKeyCanon(swigCPtr, this);
  }

  public void put_DomainKeyCanon(String newVal) {
    chilkatJNI.CkDkim_put_DomainKeyCanon(swigCPtr, this, newVal);
  }

  public void get_DomainKeyDomain(CkString str) {
    chilkatJNI.CkDkim_get_DomainKeyDomain(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String domainKeyDomain() {
    return chilkatJNI.CkDkim_domainKeyDomain(swigCPtr, this);
  }

  public void put_DomainKeyDomain(String newVal) {
    chilkatJNI.CkDkim_put_DomainKeyDomain(swigCPtr, this, newVal);
  }

  public void get_DomainKeyHeaders(CkString str) {
    chilkatJNI.CkDkim_get_DomainKeyHeaders(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String domainKeyHeaders() {
    return chilkatJNI.CkDkim_domainKeyHeaders(swigCPtr, this);
  }

  public void put_DomainKeyHeaders(String newVal) {
    chilkatJNI.CkDkim_put_DomainKeyHeaders(swigCPtr, this, newVal);
  }

  public void get_DomainKeySelector(CkString str) {
    chilkatJNI.CkDkim_get_DomainKeySelector(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String domainKeySelector() {
    return chilkatJNI.CkDkim_domainKeySelector(swigCPtr, this);
  }

  public void put_DomainKeySelector(String newVal) {
    chilkatJNI.CkDkim_put_DomainKeySelector(swigCPtr, this, newVal);
  }

  public int get_HeartbeatMs() {
    return chilkatJNI.CkDkim_get_HeartbeatMs(swigCPtr, this);
  }

  public void put_HeartbeatMs(int newVal) {
    chilkatJNI.CkDkim_put_HeartbeatMs(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkDkim_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkDkim_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkDkim_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkDkim_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkDkim_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkDkim_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkDkim_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkDkim_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkDkim_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkDkim_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_VerifyInfo(CkString str) {
    chilkatJNI.CkDkim_get_VerifyInfo(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String verifyInfo() {
    return chilkatJNI.CkDkim_verifyInfo(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkDkim_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkDkim_version(swigCPtr, this);
  }

  public boolean AddDkimSignature(CkByteData mimeIn, CkByteData outBytes) {
    return chilkatJNI.CkDkim_AddDkimSignature(swigCPtr, this, CkByteData.getCPtr(mimeIn), mimeIn, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean AddDomainKeySignature(CkByteData mimeIn, CkByteData outBytes) {
    return chilkatJNI.CkDkim_AddDomainKeySignature(swigCPtr, this, CkByteData.getCPtr(mimeIn), mimeIn, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean DkimSign(CkBinData mimeData) {
    return chilkatJNI.CkDkim_DkimSign(swigCPtr, this, CkBinData.getCPtr(mimeData), mimeData);
  }

  public boolean DkimVerify(int sigIndex, CkBinData mimeData) {
    return chilkatJNI.CkDkim_DkimVerify(swigCPtr, this, sigIndex, CkBinData.getCPtr(mimeData), mimeData);
  }

  public boolean DomainKeySign(CkBinData mimeData) {
    return chilkatJNI.CkDkim_DomainKeySign(swigCPtr, this, CkBinData.getCPtr(mimeData), mimeData);
  }

  public boolean DomainKeyVerify(int sigIndex, CkBinData mimeData) {
    return chilkatJNI.CkDkim_DomainKeyVerify(swigCPtr, this, sigIndex, CkBinData.getCPtr(mimeData), mimeData);
  }

  public boolean LoadDkimPk(String privateKey, String optionalPassword) {
    return chilkatJNI.CkDkim_LoadDkimPk(swigCPtr, this, privateKey, optionalPassword);
  }

  public boolean LoadDkimPkBytes(CkByteData privateKeyDer, String optionalPassword) {
    return chilkatJNI.CkDkim_LoadDkimPkBytes(swigCPtr, this, CkByteData.getCPtr(privateKeyDer), privateKeyDer, optionalPassword);
  }

  public boolean LoadDkimPkFile(String privateKeyFilePath, String optionalPassword) {
    return chilkatJNI.CkDkim_LoadDkimPkFile(swigCPtr, this, privateKeyFilePath, optionalPassword);
  }

  public boolean LoadDomainKeyPk(String privateKey, String optionalPassword) {
    return chilkatJNI.CkDkim_LoadDomainKeyPk(swigCPtr, this, privateKey, optionalPassword);
  }

  public boolean LoadDomainKeyPkBytes(CkByteData privateKeyDer, String optionalPassword) {
    return chilkatJNI.CkDkim_LoadDomainKeyPkBytes(swigCPtr, this, CkByteData.getCPtr(privateKeyDer), privateKeyDer, optionalPassword);
  }

  public boolean LoadDomainKeyPkFile(String privateKeyFilePath, String optionalPassword) {
    return chilkatJNI.CkDkim_LoadDomainKeyPkFile(swigCPtr, this, privateKeyFilePath, optionalPassword);
  }

  public boolean LoadPublicKey(String selector, String domain, String publicKey) {
    return chilkatJNI.CkDkim_LoadPublicKey(swigCPtr, this, selector, domain, publicKey);
  }

  public boolean LoadPublicKeyFile(String selector, String domain, String publicKeyFilepath) {
    return chilkatJNI.CkDkim_LoadPublicKeyFile(swigCPtr, this, selector, domain, publicKeyFilepath);
  }

  public boolean LoadTaskCaller(CkTask task) {
    return chilkatJNI.CkDkim_LoadTaskCaller(swigCPtr, this, CkTask.getCPtr(task), task);
  }

  public int NumDkimSignatures(CkByteData mimeData) {
    return chilkatJNI.CkDkim_NumDkimSignatures(swigCPtr, this, CkByteData.getCPtr(mimeData), mimeData);
  }

  public int NumDkimSigs(CkBinData mimeData) {
    return chilkatJNI.CkDkim_NumDkimSigs(swigCPtr, this, CkBinData.getCPtr(mimeData), mimeData);
  }

  public int NumDomainKeySignatures(CkByteData mimeData) {
    return chilkatJNI.CkDkim_NumDomainKeySignatures(swigCPtr, this, CkByteData.getCPtr(mimeData), mimeData);
  }

  public int NumDomainKeySigs(CkBinData mimeData) {
    return chilkatJNI.CkDkim_NumDomainKeySigs(swigCPtr, this, CkBinData.getCPtr(mimeData), mimeData);
  }

  public boolean PrefetchPublicKey(String selector, String domain) {
    return chilkatJNI.CkDkim_PrefetchPublicKey(swigCPtr, this, selector, domain);
  }

  public CkTask PrefetchPublicKeyAsync(String selector, String domain) {
    long cPtr = chilkatJNI.CkDkim_PrefetchPublicKeyAsync(swigCPtr, this, selector, domain);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkDkim_SaveLastError(swigCPtr, this, path);
  }

  public boolean SetDkimPrivateKey(CkPrivateKey privateKey) {
    return chilkatJNI.CkDkim_SetDkimPrivateKey(swigCPtr, this, CkPrivateKey.getCPtr(privateKey), privateKey);
  }

  public boolean SetDomainKeyPrivateKey(CkPrivateKey privateKey) {
    return chilkatJNI.CkDkim_SetDomainKeyPrivateKey(swigCPtr, this, CkPrivateKey.getCPtr(privateKey), privateKey);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkDkim_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public boolean VerifyDkimSignature(int sigIndex, CkByteData mimeData) {
    return chilkatJNI.CkDkim_VerifyDkimSignature(swigCPtr, this, sigIndex, CkByteData.getCPtr(mimeData), mimeData);
  }

  public CkTask VerifyDkimSignatureAsync(int sigIndex, CkByteData mimeData) {
    long cPtr = chilkatJNI.CkDkim_VerifyDkimSignatureAsync(swigCPtr, this, sigIndex, CkByteData.getCPtr(mimeData), mimeData);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean VerifyDomainKeySignature(int sigIndex, CkByteData mimeData) {
    return chilkatJNI.CkDkim_VerifyDomainKeySignature(swigCPtr, this, sigIndex, CkByteData.getCPtr(mimeData), mimeData);
  }

  public CkTask VerifyDomainKeySignatureAsync(int sigIndex, CkByteData mimeData) {
    long cPtr = chilkatJNI.CkDkim_VerifyDomainKeySignatureAsync(swigCPtr, this, sigIndex, CkByteData.getCPtr(mimeData), mimeData);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

}
