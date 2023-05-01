.class public final Ll1/i$b;
.super Ll1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll1/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll1/c<",
        "Ll1/i$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll1/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ll1/l;
    .locals 1

    new-instance v0, Ll1/i$a;

    invoke-direct {v0, p0}, Ll1/i$a;-><init>(Ll1/i$b;)V

    return-object v0
.end method
