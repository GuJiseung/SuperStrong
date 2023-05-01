.class public final Ls4/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le4/f$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls4/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le4/f$c<",
        "Ls4/u;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic b:Ls4/u$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls4/u$a;

    invoke-direct {v0}, Ls4/u$a;-><init>()V

    sput-object v0, Ls4/u$a;->b:Ls4/u$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
