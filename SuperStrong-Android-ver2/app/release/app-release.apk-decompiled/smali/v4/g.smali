.class public final Lv4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lc0/d;

.field public static final c:Ljava/util/LinkedHashMap;

.field public static final d:Lv4/g;

.field public static final e:Lv4/g;

.field public static final f:Lv4/g;

.field public static final g:Lv4/g;

.field public static final h:Lv4/g;

.field public static final i:Lv4/g;

.field public static final j:Lv4/g;

.field public static final k:Lv4/g;

.field public static final l:Lv4/g;

.field public static final m:Lv4/g;

.field public static final n:Lv4/g;

.field public static final o:Lv4/g;

.field public static final p:Lv4/g;

.field public static final q:Lv4/g;

.field public static final r:Lv4/g;

.field public static final s:Lv4/g;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc0/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lc0/d;-><init>(I)V

    sput-object v0, Lv4/g;->b:Lc0/d;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lv4/g;->c:Ljava/util/LinkedHashMap;

    const-string v0, "SSL_RSA_WITH_NULL_MD5"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_RSA_WITH_NULL_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_RSA_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_RSA_WITH_RC4_128_MD5"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_RSA_WITH_RC4_128_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_RSA_WITH_DES_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->d:Lv4/g;

    const-string v0, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_DHE_DSS_WITH_DES_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_DHE_RSA_WITH_DES_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_DH_anon_WITH_RC4_128_MD5"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_DH_anon_WITH_DES_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_KRB5_WITH_DES_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_KRB5_WITH_RC4_128_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_KRB5_WITH_DES_CBC_MD5"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_KRB5_WITH_RC4_128_MD5"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->e:Lv4/g;

    const-string v0, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DH_anon_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->f:Lv4/g;

    const-string v0, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DH_anon_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_RSA_WITH_NULL_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_RSA_WITH_AES_256_CBC_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DH_anon_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DH_anon_WITH_AES_256_CBC_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_PSK_WITH_RC4_128_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_PSK_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_PSK_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_PSK_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_RSA_WITH_SEED_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->g:Lv4/g;

    const-string v0, "TLS_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->h:Lv4/g;

    const-string v0, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DH_anon_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_DH_anon_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_FALLBACK_SCSV"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_ECDSA_WITH_NULL_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_NULL_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_RSA_WITH_NULL_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_RSA_WITH_RC4_128_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_RSA_WITH_NULL_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_RSA_WITH_RC4_128_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->i:Lv4/g;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->j:Lv4/g;

    const-string v0, "TLS_ECDH_anon_WITH_NULL_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_anon_WITH_RC4_128_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->k:Lv4/g;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->l:Lv4/g;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->m:Lv4/g;

    const-string v0, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->n:Lv4/g;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->o:Lv4/g;

    const-string v0, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->p:Lv4/g;

    const-string v0, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_AES_128_GCM_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->q:Lv4/g;

    const-string v0, "TLS_AES_256_GCM_SHA384"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->r:Lv4/g;

    const-string v0, "TLS_CHACHA20_POLY1305_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    move-result-object v0

    sput-object v0, Lv4/g;->s:Lv4/g;

    const-string v0, "TLS_AES_128_CCM_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    const-string v0, "TLS_AES_128_CCM_8_SHA256"

    invoke-static {v0}, Lv4/g;->b(Ljava/lang/String;)Lv4/g;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lv4/g;->a:Ljava/lang/String;

    return-void
.end method

.method public static declared-synchronized a(Ljava/lang/String;)Lv4/g;
    .locals 6

    .line 1
    const-class v0, Lv4/g;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lv4/g;->c:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    check-cast v2, Lv4/g;

    .line 11
    .line 12
    if-nez v2, :cond_3

    .line 13
    .line 14
    const-string v2, "TLS_"

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const-string v4, "SSL_"

    .line 21
    .line 22
    const/4 v5, 0x4

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    new-instance v3, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move-object v2, p0

    .line 66
    :goto_0
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Lv4/g;

    .line 71
    .line 72
    if-nez v2, :cond_2

    .line 73
    .line 74
    new-instance v2, Lv4/g;

    .line 75
    .line 76
    invoke-direct {v2, p0}, Lv4/g;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    invoke-interface {v1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    :cond_3
    monitor-exit v0

    .line 83
    return-object v2

    .line 84
    :catchall_0
    move-exception p0

    .line 85
    monitor-exit v0

    .line 86
    throw p0
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method

.method public static b(Ljava/lang/String;)Lv4/g;
    .locals 2

    new-instance v0, Lv4/g;

    invoke-direct {v0, p0}, Lv4/g;-><init>(Ljava/lang/String;)V

    sget-object v1, Lv4/g;->c:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv4/g;->a:Ljava/lang/String;

    return-object v0
.end method
