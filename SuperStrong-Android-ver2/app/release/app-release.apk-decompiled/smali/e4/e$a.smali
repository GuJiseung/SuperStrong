.class public final Le4/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le4/f$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le4/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le4/f$c<",
        "Le4/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic b:Le4/e$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le4/e$a;

    invoke-direct {v0}, Le4/e$a;-><init>()V

    sput-object v0, Le4/e$a;->b:Le4/e$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
